package ru.grandi.bambino.rulesofthegame.presentation.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class SplashActivity : AppCompatActivity() {

    private val viewModel by lazy { ViewModelProvider(this).get(SplashViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel.showSplash()

        startActivity()
    }

    private fun startActivity(){
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}