package ba.etf.rma22.rma23_18957

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ImpressionListAdapter(private var impressions: List<UserImpression>) : RecyclerView.Adapter<ImpressionListAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_userimpression, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
impressions=impressions.sortedBy { x->x.timestamp }.reversed()
   if(impressions[position] is UserRating){
       holder.comment.visibility=View.GONE
       holder.ratingBar.visibility=View.VISIBLE
       holder.ratingBar.numStars=10
       var impr:UserRating= impressions[position] as UserRating
       println(impr.rating.toFloat())
       holder.ratingBar.rating=(impr).rating.toFloat()
       holder.userName.text=impressions[position].username
   }
   else{
       holder.ratingBar.visibility=View.GONE
       holder.comment.visibility = View.VISIBLE
       holder.userName.text=impressions[position].username
       holder.comment.text=(impressions[position] as UserReview).review
   }
    }

    override fun getItemCount(): Int = impressions.size

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userName: TextView=itemView.findViewById(R.id.username_textview)
        val ratingBar: RatingBar=itemView.findViewById(R.id.rating_bar)
        val comment: TextView=itemView.findViewById(R.id.review_textview)
    }


}
