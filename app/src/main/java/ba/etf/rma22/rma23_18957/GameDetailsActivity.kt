package ba.etf.rma22.rma23_18957

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class GameDetailsActivity:AppCompatActivity() {
    lateinit var homeButton: Button
    lateinit var detailsButton: Button
    lateinit var coverImage: ImageView
    lateinit var platform: TextView
    lateinit var releaseDate: TextView
    lateinit var title:TextView
    lateinit var esrbRating: TextView
    lateinit var developer: TextView
    lateinit var publisher: TextView
    lateinit var genre: TextView
    lateinit var description: TextView
    lateinit var recycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_details)
        homeButton=findViewById(R.id.home_button)
        detailsButton=findViewById(R.id.details_button)
        coverImage=findViewById(R.id.cover_imageview)
        homeButton.isEnabled=true
        homeButton.setOnClickListener {
            var title=intent.getStringExtra("game")
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("game",title)
            this.startActivity(intent)}
        detailsButton.isEnabled=false
        val gameName=intent.getStringExtra("game");
println(intent.getStringExtra("game"))
        val gameDetails= gameName?.let { GameData.getDetails(it) };
        var n1= gameDetails?.coverImage
        if (n1 != null) {
            n1=n1.substringBefore(".")
        }
        val resourceId = resources.getIdentifier(n1, "drawable", "ba.etf.rma22.rma23_18957")
            coverImage.setImageResource(resourceId)
        platform=findViewById(R.id.platform_textview)
        if (gameDetails != null) {
            platform.text=gameDetails.platform
        }
        releaseDate=findViewById(R.id.release_date_textview)
        if (gameDetails != null) {
            releaseDate.text=gameDetails.releaseDate
        }
        title=findViewById(R.id.game_title_textview)
        if (gameDetails != null) {
            title.text=gameDetails.title
        }
        esrbRating=findViewById(R.id.esrb_rating_textview)
        if (gameDetails != null) {
            esrbRating.text=gameDetails.esrbRating
        }
        developer=findViewById(R.id.developer_textview)
        if (gameDetails != null) {
            developer.text=gameDetails.developer
        }
        publisher=findViewById(R.id.publisher_textview)
        if (gameDetails != null) {
            publisher.text=gameDetails.publisher
        }
        genre=findViewById(R.id.genre_textview)
        if (gameDetails != null) {
            genre.text=gameDetails.genre
        }
        description=findViewById(R.id.description_textview)
        if (gameDetails != null) {
            description.text=gameDetails.description
        }
        recycler=findViewById(R.id.recyclerView)
        recycler.layoutManager = LinearLayoutManager(this)
        println(gameDetails?.userImpressions)
        var adapter= gameDetails?.let { ImpressionListAdapter(it.userImpressions) }
        recycler.adapter=adapter

    }
}