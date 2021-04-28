package ru.grandi.bambino.rulesofthegame.presentation.ui.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.grandi.bambino.rulesofthegame.repository.DataResult
import ru.grandi.bambino.rulesofthegame.repository.Repository

class PlayersViewModel(private val repository: Repository) : ViewModel() {

    private val _playersLiveData = MutableLiveData<DataResult>()
    val playersLiveData = _playersLiveData

    fun getAllPlayers(typeSport: String) {
        _playersLiveData.postValue(DataResult.Success(repository.getPlayers(typeSport)))
    }
}