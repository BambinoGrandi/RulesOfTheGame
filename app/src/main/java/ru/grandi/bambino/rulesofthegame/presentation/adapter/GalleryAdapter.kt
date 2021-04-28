package ru.grandi.bambino.rulesofthegame.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import ru.grandi.bambino.rulesofthegame.R
import ru.grandi.bambino.rulesofthegame.data.entity.GalleryPhoto
import ru.grandi.bambino.rulesofthegame.utils.image.ImageLoader

class GalleryAdapter(private val imageLoader: ImageLoader) :
    RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder>() {

    private var data = mutableListOf<GalleryPhoto>()

    fun setData(data: MutableList<GalleryPhoto>) {
        this.data = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder =
        GalleryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.gallery_item, parent, false)
        )

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        holder.initFields()
        holder.bind(data[position], imageLoader)
    }

    override fun getItemCount() = data.size

    class GalleryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private lateinit var photoGallery: ImageView

        fun initFields() {
            photoGallery = itemView.findViewById(R.id.gallery_photo)
        }

        fun bind(player: GalleryPhoto, imageLoader: ImageLoader) {
            imageLoader.imageLoad(player.photo, photoGallery)
        }

    }
}
