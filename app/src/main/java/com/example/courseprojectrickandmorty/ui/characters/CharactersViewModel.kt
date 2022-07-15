package com.example.courseprojectrickandmorty.ui.characters

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.base.utils.io
import com.example.base.utils.ui
import com.example.courseprojectrickandmorty.state.CharactersVS
import com.example.courseprojectrickandmorty.ui.widget.CharacterItem
import com.example.courseprojectrickandmorty.utils.pageCharacters
import com.example.courseprojectrickandmorty.widgets.WidgetItem
import com.example.domain.interactor.CharactersInteractor
import com.example.domain.model.Characters
import kotlinx.coroutines.launch

class CharactersViewModel(
    private val charactersInteractor: CharactersInteractor
) : ViewModel() {

    private val _viewCharactersState = MutableLiveData<CharactersVS>(CharactersVS.ShowLoader)
    val viewCharactersState: LiveData<CharactersVS> = _viewCharactersState

    private val charactersMapper by lazy { CharacterMapper() }

    private var page: Int? = null

    init {
        getCharacters()
    }

    fun getCharacters() {
        viewModelScope.launch {
            try {
                io {
                    charactersInteractor.execute(
                        CharactersInteractor.Params(
                            page = page
                        )
                    )
                        .collect {
                            ui {
                                _viewCharactersState.value =
                                    CharactersVS.AddCharacters(mapData(it), it.info?.count ?: 100)
                            }
                        }
                }
            } catch (e: Exception) {
                ui {
                    _viewCharactersState.value = CharactersVS.Error(e.message)
                }
            }
        }
    }

    private fun mapData(item: Characters): MutableList<WidgetItem> {
        val list = mutableListOf<WidgetItem>()

        page = item.info?.next?.pageCharacters()

        item.results?.forEach {
            list.add(CharacterItem(charactersMapper.map(it).apply {
                onClick = {

                }
            }))
        }

        return list
    }

}