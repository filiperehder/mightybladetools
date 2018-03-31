package frogcorp.mightybladetools.features.items.armor

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import frogcorp.mightybladetools.R
import frogcorp.presentation.items.model.ArmorItemView
import kotlinx.android.synthetic.main.item_armor_view.view.*

class AdapterArmor(private val context: Context,
                   private val items: List<ArmorItemView>) : RecyclerView.Adapter<AdapterArmor.ArmorViewHolder>() {

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ArmorViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_armor_view, parent, false)
        return ArmorViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArmorViewHolder?, position: Int) {
        holder as ArmorViewHolder
        holder.bind(items[position])
    }

    inner class ArmorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.armorName
        val defense = itemView.armorDefense
        val weight = itemView.armorWeight
        val price = itemView.armorPrice

        fun bind(item: ArmorItemView) {
            name.text = item.name
            defense.text = item.defense.toString()
            weight.text = item.weight.toString()
            price.text = item.price.toString()
        }
    }
}