package ru.grandi.bambino.rulesofthegame.utils.image

import android.widget.ImageView
import com.bumptech.glide.Glide

class GlideImageLoader : ImageLoader {
    override fun imageLoad(res: Int, container: ImageView) {
        Glide.with(container.context)
            .load(res)
            .into(container)

    }
}