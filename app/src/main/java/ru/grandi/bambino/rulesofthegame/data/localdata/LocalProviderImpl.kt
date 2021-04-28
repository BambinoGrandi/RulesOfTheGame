package ru.grandi.bambino.rulesofthegame.data.localdata

class LocalProviderImpl : LocalProvider {
    override fun getRulesGame(typeSport: String) = getRulesGameData(typeSport)
    override fun getPlayers(typeSport: String) = getPlayersData(typeSport)
    override fun getGalleryPhoto(typeSport: String) = getGalleryPhotoData(typeSport)
}