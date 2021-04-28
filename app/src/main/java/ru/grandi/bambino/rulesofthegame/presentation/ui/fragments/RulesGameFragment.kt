package ru.grandi.bambino.rulesofthegame.presentation.ui.fragments

import android.view.View
import android.widget.TextView
import org.koin.android.viewmodel.ext.android.viewModel
import ru.grandi.bambino.rulesofthegame.R
import ru.grandi.bambino.rulesofthegame.data.entity.RulesGame
import ru.grandi.bambino.rulesofthegame.repository.DataResult
import ru.grandi.bambino.rulesofthegame.utils.TAG_ERROR_RULES_GAME
import ru.grandi.bambino.rulesofthegame.utils.TYPE_SPORT
import ru.grandi.bambino.rulesofthegame.utils.logError

class RulesGameFragment : BaseFragment(R.layout.fragment_rules_game) {

    private val rulesGameViewModel by viewModel<RulesGameViewModel>()

    private lateinit var textRules: TextView
    private lateinit var titleRules: TextView

    override var bottomNavigationViewVisibility = View.VISIBLE

    override fun onStart() {
        super.onStart()
        initField(root)
        rulesGameViewModel.getRulesGame(TYPE_SPORT)
        renderData()
    }

    private fun initField(root: View) {
        textRules = root.findViewById(R.id.rules_game_text)
        titleRules = root.findViewById(R.id.rules_game_title)
    }

    private fun renderData() {
        rulesGameViewModel.rulesLiveData.observe(viewLifecycleOwner) {
            when (it) {
                is DataResult.Success<*> -> {
                    textRules.text = (it.data as RulesGame).text
                    titleRules.text = it.data.title
                }
                is DataResult.Error -> {
                    logError(TAG_ERROR_RULES_GAME, it.error.message.toString())

                }
            }
        }
    }

}