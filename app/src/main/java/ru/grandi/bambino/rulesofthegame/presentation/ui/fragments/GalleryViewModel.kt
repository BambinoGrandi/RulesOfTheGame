package ru.grandi.bambino.rulesofthegame.presentation.ui.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.grandi.bambino.rulesofthegame.repository.DataResult
import ru.grandi.bambino.rulesofthegame.repository.Repository

class GalleryViewModel(private val repository: Repository) : ViewModel() {

    private val _galleryPhotoLiveData = MutableLiveData<DataResult>()
    val galleryPhotoLiveData = _galleryPhotoLiveData

    fun getGalleryPhoto(typeSport: String) {
        _galleryPhotoLiveData.postValue(DataResult.Success(repository.getGalleryPhoto(typeSport)))
    }

}