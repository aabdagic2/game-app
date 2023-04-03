package ba.etf.rma22.rma23_18957

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val games: List<Game>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_game, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
 holder.title.text=games[position].title
 holder.platform.text=games[position].platform
 holder.releaseDate.text=games[position].releaseDate
 holder.rating.text=games[position].rating.toString()
 holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,GameDetailsActivity::class.java)
            intent.putExtra("game",games[position].title)
            holder.itemView.context.startActivity(intent) }}

    override fun getItemCount(): Int = games.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val rating: TextView=itemView.findViewById(R.id.game_rating_textview)
        val title: TextView=itemView.findViewById(R.id.game_title_textview)
        val releaseDate:TextView=itemView.findViewById(R.id.game_release_date_textview)
        val platform: TextView=itemView.findViewById(R.id.game_platform_textview)
        init {

        }
    }
}
