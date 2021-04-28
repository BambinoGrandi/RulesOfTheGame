package ru.grandi.bambino.rulesofthegame.utils

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

fun logDebug(tag: String, message: String){
    Log.d(tag, message)
}


fun logError(tag: String, message: String){
    Log.e(tag, message)
}

fun Fragment.navigate() : NavController {
    return NavHostFragment.findNavController(this)
}