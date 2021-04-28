package ru.grandi.bambino.rulesofthegame.presentation.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.grandi.bambino.rulesofthegame.presentation.ui.activity.MainActivity

abstract class BaseFragment(private val layout: Int) : Fragment() {

    protected open var bottomNavigationViewVisibility = View.VISIBLE
    protected lateinit var root: View

    private lateinit var mainActivity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(layout, container, false)

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity is MainActivity){
            mainActivity = activity as MainActivity
            mainActivity.setBottomNavigationVisibility(bottomNavigationViewVisibility)
        }
    }

    override fun onResume() {
        super.onResume()
        if (activity is MainActivity) {
            mainActivity.setBottomNavigationVisibility(bottomNavigationViewVisibility)
        }
    }

}