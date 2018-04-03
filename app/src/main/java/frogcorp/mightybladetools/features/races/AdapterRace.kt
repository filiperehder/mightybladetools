package frogcorp.mightybladetools.features.races

import android.app.Activity
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import frogcorp.mightybladetools.R
import kotlinx.android.synthetic.main.item_race_view.view.*

class AdapterRace(private val context: Activity,
                  val items: List<String>) : RecyclerView.Adapter<AdapterRace.RaceViewHolder>() {

    override fun onBindViewHolder(holder: RaceViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RaceViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_race_view, parent, false)
        return RaceViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class RaceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val name = itemView.raceName

        fun bind(item: String) {
            name.text = item

            Log.d("ITEM", item)

            name.setOnClickListener {
                val intent = Intent(context, ActivityRaceDetail::class.java)
                intent.putExtra("race", item.toLowerCase())

                context.startActivity(intent)
            }
        }
    }
}