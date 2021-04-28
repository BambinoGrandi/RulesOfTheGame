package ru.grandi.bambino.rulesofthegame.presentation.ui.fragments

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel
import ru.grandi.bambino.rulesofthegame.R
import ru.grandi.bambino.rulesofthegame.data.entity.GalleryPhoto
import ru.grandi.bambino.rulesofthegame.presentation.adapter.GalleryAdapter
import ru.grandi.bambino.rulesofthegame.repository.DataResult
import ru.grandi.bambino.rulesofthegame.utils.TAG_ERROR_GALLERY_PHOTO
import ru.grandi.bambino.rulesofthegame.utils.TYPE_SPORT
import ru.grandi.bambino.rulesofthegame.utils.logError

class GalleryFragment : BaseFragment(R.layout.fragment_gallery) {

    private val galleryViewModel by viewModel<GalleryViewModel>()
    private val adapter by inject<GalleryAdapter>()

    private lateinit var galleryPhotosRV: RecyclerView

    override var bottomNavigationViewVisibility = View.VISIBLE

    override fun onStart() {
        super.onStart()
        initFields(root)
        initAdapter()
        galleryViewModel.getGalleryPhoto(TYPE_SPORT)
        getData()
    }

    private fun getData(){
        galleryViewModel.galleryPhotoLiveData.observe(viewLifecycleOwner) {
            when (it) {
                is DataResult.Success<*> -> {
                    renderData(it.data as MutableList<GalleryPhoto>)
                }
                is DataResult.Error -> {
                    logError(TAG_ERROR_GALLERY_PHOTO, it.error.message.toString())
                }
            }
        }
    }

   private fun initFields(view: View) {
       galleryPhotosRV = view.findViewById(R.id.gallery_rv)
   }

    private fun initAdapter(){
        galleryPhotosRV.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false )
        galleryPhotosRV.adapter = adapter
    }

    private fun renderData(data: MutableList<GalleryPhoto>){
        adapter.setData(data)
    }

}