package ru.grandi.bambino.rulesofthegame.presentation.ui.activity

import androidx.lifecycle.ViewModel
import java.lang.Thread.sleep

class SplashViewModel : ViewModel() {

    fun showSplash(){
        sleep(3000)
    }
}