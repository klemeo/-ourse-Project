package com.example.characters

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.base.mapper.map
import com.example.base.models.Characters
import com.example.base.utils.io
import com.example.base.utils.ui
import com.example.courseprojectrickandmorty.utils.pageCharacters
import com.friendly.universal_recycler.WidgetItem
import com.example.domain.interactor.CharactersInteractor
import kotlinx.coroutines.launch

class CharactersViewModel(
    private val charactersInteractor: CharactersInteractor
) : ViewModel() {

    private val _viewCharactersState = MutableLiveData<CharactersVS>(CharactersVS.ShowLoader)
    val viewCharactersState: LiveData<CharactersVS> = _viewCharactersState

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
                                    CharactersVS.Content(mapData(it), it.info?.count ?: 100)
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
            list.add(CharacterItem(it.map().apply {
                onClick = {

                }
            }))
        }

        return list
    }

}