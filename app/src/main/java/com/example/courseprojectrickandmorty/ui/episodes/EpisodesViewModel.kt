package com.example.courseprojectrickandmorty.ui.episodes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.base.utils.io
import com.example.base.utils.ui
import com.example.courseprojectrickandmorty.state.EpisodesVS
import com.example.courseprojectrickandmorty.ui.widget.TextItem
import com.example.courseprojectrickandmorty.utils.pageEpisodes
import com.example.courseprojectrickandmorty.widgets.WidgetItem
import com.example.domain.interactor.EpisodesInteractor
import com.example.domain.model.Episodes
import kotlinx.coroutines.launch

class EpisodesViewModel(
    private val episodesInteractor: EpisodesInteractor
) : ViewModel() {

    private val _viewEpisodesState = MutableLiveData<EpisodesVS>(EpisodesVS.ShowLoader)
    val viewEpisodesState: LiveData<EpisodesVS> = _viewEpisodesState

    private val episodeMapper by lazy { EpisodeMapper() }

    private var page: Int? = null

    init {
        getEpisodes()
    }

    fun getEpisodes() {
        viewModelScope.launch {
            try {
                io {
                    episodesInteractor.execute(
                        EpisodesInteractor.Params(
                            page = page
                        )
                    )
                        .collect {
                            ui {
                                _viewEpisodesState.value =
                                    EpisodesVS.AddEpisodes(mapData(it), it.info?.count ?: 100)
                            }
                        }
                }
            } catch (e: Exception) {
                ui {
                    _viewEpisodesState.value = EpisodesVS.Error(e.message)
                }
            }
        }
    }

    private fun mapData(item: Episodes): MutableList<WidgetItem> {
        val list = mutableListOf<WidgetItem>()

        page = item.info?.next?.pageEpisodes()

        item.results?.forEach {
            list.add(TextItem(episodeMapper.map(it).apply {
                onClick = {

                }
            }))
        }

        return list
    }

}