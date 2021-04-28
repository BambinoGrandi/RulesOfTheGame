package ru.grandi.bambino.rulesofthegame.repository

import ru.grandi.bambino.rulesofthegame.data.entity.GalleryPhoto
import ru.grandi.bambino.rulesofthegame.data.entity.Player
import ru.grandi.bambino.rulesofthegame.data.entity.RulesGame
import ru.grandi.bambino.rulesofthegame.data.localdata.LocalProvider

class RepositoryImpl(private val localProvider: LocalProvider) : Repository {
    override fun getRulesGame(typeSport: String): RulesGame {
        return localProvider.getRulesGame(typeSport)
    }

    override fun getPlayers(typeSport: String): List<Player> {
        return localProvider.getPlayers(typeSport)
    }

    override fun getGalleryPhoto(typeSport: String): List<GalleryPhoto>{
        return localProvider.getGalleryPhoto(typeSport)
    }
}