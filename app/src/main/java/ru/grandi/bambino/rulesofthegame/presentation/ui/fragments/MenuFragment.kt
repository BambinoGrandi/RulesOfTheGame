package ru.grandi.bambino.rulesofthegame.presentation.ui.fragments

import android.view.View
import android.widget.Button
import ru.grandi.bambino.rulesofthegame.R
import ru.grandi.bambino.rulesofthegame.utils.*

class MenuFragment : BaseFragment(R.layout.fragment_menu) {

    private lateinit var footballBtn: Button
    private lateinit var basketballBtn: Button
    private lateinit var volleyballBtn: Button
    private lateinit var formulaOneBtn: Button

    override var bottomNavigationViewVisibility: Int = View.GONE


    override fun onStart() {
        super.onStart()
        initFields(root)
        openFootballScreen()
        openBasketballScreen()
        openVolleyballScreen()
        openFormulaOneScreen()
    }

    private fun initFields(view: View) {
        footballBtn = view.findViewById(R.id.football_btn)
        basketballBtn = view.findViewById(R.id.basketball_btn)
        volleyballBtn = view.findViewById(R.id.volleyball_btn)
        formulaOneBtn = view.findViewById(R.id.formula_one_btn)
    }

    private fun openFootballScreen() {
        footballBtn.setOnClickListener {
            TYPE_SPORT = FOOTBALL

            navigate().navigate(R.id.navigation_rules)
        }
    }

    private fun openBasketballScreen() {
        basketballBtn.setOnClickListener {
            TYPE_SPORT = BASKETBALL

            navigate().navigate(R.id.navigation_rules)
        }
    }

    private fun openVolleyballScreen() {
        volleyballBtn.setOnClickListener {
            TYPE_SPORT = VOLLEYBALL

            navigate().navigate(R.id.navigation_rules)
        }
    }

    private fun openFormulaOneScreen() {
        formulaOneBtn.setOnClickListener {
            TYPE_SPORT = FORMULA_ONE

            navigate().navigate(R.id.navigation_rules)
        }
    }
}