package ru.grandi.bambino.rulesofthegame.presentation.ui.fragments

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel
import ru.grandi.bambino.rulesofthegame.R
import ru.grandi.bambino.rulesofthegame.data.entity.Player
import ru.grandi.bambino.rulesofthegame.presentation.adapter.PlayerAdapter
import ru.grandi.bambino.rulesofthegame.repository.DataResult
import ru.grandi.bambino.rulesofthegame.utils.TAG_ERROR_PLAYERS
import ru.grandi.bambino.rulesofthegame.utils.TYPE_SPORT
import ru.grandi.bambino.rulesofthegame.utils.logError

class PlayersFragment : BaseFragment(R.layout.fragment_players) {

    private val playersViewModel by viewModel<PlayersViewModel>()
    private val adapter by inject<PlayerAdapter>()

    private lateinit var playersRV: RecyclerView

    override var bottomNavigationViewVisibility = View.VISIBLE

    override fun onStart() {
        super.onStart()
        initFields(root)
        initRecycler()
        playersViewModel.getAllPlayers(TYPE_SPORT)
        loadData()
    }

    private fun initFields(view: View) {
        playersRV = view.findViewById(R.id.players_rv)
    }

    private fun loadData() {
        playersViewModel.playersLiveData.observe(viewLifecycleOwner) {
            when (it) {
                is DataResult.Success<*> -> {
                    renderData(it.data as MutableList<Player>)
                }
                is DataResult.Error -> {
                    logError(TAG_ERROR_PLAYERS, it.error.message.toString())
                }
            }
        }
    }

    private fun renderData(players: MutableList<Player>) {
        adapter.setData(players)
    }

    private fun initRecycler() {
        playersRV.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        playersRV.adapter = adapter
    }

}