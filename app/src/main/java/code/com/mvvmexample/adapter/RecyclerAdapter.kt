package code.com.mvvmexample.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import code.com.mvvmexample.R
import code.com.mvvmexample.models.ModelPlace
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.layout_item.view.*

/**
 * Created by Prashant Gupta on 06,February,2019
 */
class RecyclerAdapter(var context: Context, var placesList: List<ModelPlace>) :
        RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.layout_item, parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return placesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.titleName?.text= placesList[position].title
        Glide.with(context).asBitmap().load(placesList[position].imageUrl).into(holder.image!!)
    }

  class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var titleName: TextView? = itemView.image_name
        var image: CircleImageView? = itemView.image
    }
}