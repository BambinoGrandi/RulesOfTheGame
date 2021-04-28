package ru.grandi.bambino.rulesofthegame

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import ru.grandi.bambino.rulesofthegame.di.repositoryModules
import ru.grandi.bambino.rulesofthegame.di.utilsModule
import ru.grandi.bambino.rulesofthegame.di.viewModelModules

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(listOf(
                repositoryModules, viewModelModules, utilsModule
            ))
        }
    }

}