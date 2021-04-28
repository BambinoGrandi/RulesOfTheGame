package ru.grandi.bambino.rulesofthegame.di

import org.koin.android.experimental.dsl.viewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.grandi.bambino.rulesofthegame.data.localdata.LocalProvider
import ru.grandi.bambino.rulesofthegame.data.localdata.LocalProviderImpl
import ru.grandi.bambino.rulesofthegame.presentation.adapter.GalleryAdapter
import ru.grandi.bambino.rulesofthegame.presentation.adapter.PlayerAdapter
import ru.grandi.bambino.rulesofthegame.presentation.ui.fragments.GalleryViewModel
import ru.grandi.bambino.rulesofthegame.presentation.ui.fragments.PlayersViewModel
import ru.grandi.bambino.rulesofthegame.presentation.ui.fragments.RulesGameViewModel
import ru.grandi.bambino.rulesofthegame.repository.Repository
import ru.grandi.bambino.rulesofthegame.repository.RepositoryImpl
import ru.grandi.bambino.rulesofthegame.utils.image.GlideImageLoader
import ru.grandi.bambino.rulesofthegame.utils.image.ImageLoader

val repositoryModules = module {
    single<LocalProvider> { LocalProviderImpl() }
    single<Repository> { RepositoryImpl(get()) }
}

val viewModelModules = module {
    viewModel { GalleryViewModel(get()) }
    viewModel { RulesGameViewModel(get()) }
    viewModel { PlayersViewModel(get()) }
}

val utilsModule = module {
    single<ImageLoader> { GlideImageLoader() }
    factory { GalleryAdapter(get()) }
    factory { PlayerAdapter(get()) }
}