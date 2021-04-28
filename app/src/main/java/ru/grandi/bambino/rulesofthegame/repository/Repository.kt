package ru.grandi.bambino.rulesofthegame.repository

import ru.grandi.bambino.rulesofthegame.data.entity.GalleryPhoto
import ru.grandi.bambino.rulesofthegame.data.entity.Player
import ru.grandi.bambino.rulesofthegame.data.entity.RulesGame

interface Repository {
    fun getRulesGame(typeSport: String): RulesGame
    fun getPlayers(typeSport: String): List<Player>
    fun getGalleryPhoto(typeSport: String): List<GalleryPhoto>

}