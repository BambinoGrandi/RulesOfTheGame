package ru.grandi.bambino.rulesofthegame.presentation.ui.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.grandi.bambino.rulesofthegame.repository.DataResult
import ru.grandi.bambino.rulesofthegame.repository.Repository

class RulesGameViewModel(private val repository: Repository) : ViewModel() {

    private val _rulesGameLiveData = MutableLiveData<DataResult>()
    val rulesLiveData = _rulesGameLiveData

    fun getRulesGame(typeSport: String) {
        _rulesGameLiveData.postValue(DataResult.Success(repository.getRulesGame(typeSport)))
    }
}