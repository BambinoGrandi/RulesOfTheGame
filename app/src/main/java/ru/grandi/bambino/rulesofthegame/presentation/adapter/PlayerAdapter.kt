package ru.grandi.bambino.rulesofthegame.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.grandi.bambino.rulesofthegame.R
import ru.grandi.bambino.rulesofthegame.data.entity.Player
import ru.grandi.bambino.rulesofthegame.utils.image.ImageLoader

class PlayerAdapter(private val imageLoader: ImageLoader) : RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {

    private var data = mutableListOf<Player>()

    fun setData(data: MutableList<Player>) {
        this.data = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder =
        PlayerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.player_item, parent, false))

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        holder.initFields()
        holder.bind(data[position], imageLoader)
    }

    override fun getItemCount() = data.size

    class PlayerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private lateinit var namePlayer: TextView
        private lateinit var typeSportPlayer: TextView
        private lateinit var photoPlayer: ImageView

        fun initFields() {
            namePlayer = itemView.findViewById(R.id.name_players)
            typeSportPlayer = itemView.findViewById(R.id.type_sport_players)
            photoPlayer = itemView.findViewById(R.id.photo_player)
        }

        fun bind(player: Player, imageLoader: ImageLoader) {
            namePlayer.text = player.name
            typeSportPlayer.text = player.typeSport
            player.photo?.let { photo -> imageLoader.imageLoad(photo, photoPlayer) }
        }

    }
}
