package no.kristiania.android.somethingwithboats

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.place_row.view.*

class MainAdapter(val homeFeed: HomeFeed): RecyclerView.Adapter<CustomViewHolder>() {

    val placeTittles = listOf("First title", "Second", "Third", "More Titles")

    override fun getItemCount(): Int {
        return homeFeed.properties.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.place_row, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
//        val places = places.get(position)
        val properties = homeFeed.properties.get(position)
        holder?.view?.textView_place?.text = properties.name
    }
}

class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view) {


}