package ba.etf.rma22.rma23_18957

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class HomeActivity : AppCompatActivity() {
    lateinit var recyclerView:RecyclerView
    lateinit var searchButton: ImageButton
    lateinit var searchEditText: EditText
    lateinit var homeButton: Button
    lateinit var detailsButton: Button
    var flag=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.game_list);
        homeButton=findViewById(R.id.home_button)
        detailsButton=findViewById(R.id.details_button)
        val games=GameData.getAll()
        homeButton.isEnabled=false
        detailsButton.isEnabled=false
        val adapter= RecyclerAdapter(games = games)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter=adapter
        searchButton=findViewById(R.id.search_button)
        searchEditText=findViewById(R.id.search_query_edittext)
        searchButton.setOnClickListener {
       var pretraga:String= searchEditText.text.toString()
            var games1=GameData.getAll().filter { x -> x.title.lowercase().contains(pretraga.lowercase()) }
            val adapter=RecyclerAdapter(games1)
            recyclerView.adapter=adapter
        }
        if(intent.hasExtra("game")){
            homeButton.isEnabled=false
            detailsButton.isEnabled=true
            detailsButton.setOnClickListener {
                var title=intent.getStringExtra("game")
                val intent = Intent(this, GameDetailsActivity::class.java)
                intent.putExtra("game",title)
                this.startActivity(intent)
            }
        }
    }
}