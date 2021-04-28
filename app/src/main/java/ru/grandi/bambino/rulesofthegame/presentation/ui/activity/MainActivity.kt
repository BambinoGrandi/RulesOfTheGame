package ru.grandi.bambino.rulesofthegame.presentation.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView
import ru.grandi.bambino.rulesofthegame.R

class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: MaterialToolbar
    private lateinit var navView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFields()
        initNavigation()
        setSupportActionBar(toolbar)

    }

    private fun initFields() {
        toolbar = findViewById(R.id.toolbar_main)
        navView = findViewById(R.id.nav_view)
    }

    private fun initNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        navView.setupWithNavController(navController)
    }

    fun setBottomNavigationVisibility(visibility: Int){
        navView.visibility = visibility
    }

}