package ru.grandi.bambino.rulesofthegame.utils.image

import android.widget.ImageView

interface ImageLoader {
    fun imageLoad(res: Int, container: ImageView)
}