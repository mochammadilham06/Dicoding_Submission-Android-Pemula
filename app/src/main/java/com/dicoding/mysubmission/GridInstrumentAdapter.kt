package com.dicoding.mysubmission


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class GridInstrumentAdapter(val listInstrument: ArrayList<Instrument>) : RecyclerView.Adapter<GridInstrumentAdapter.GridViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data:Instrument)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_instrument, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        val instrument = listInstrument[position]
        Glide.with(holder.itemView.context)
            .load(instrument.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = instrument.name
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listInstrument[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listInstrument.size
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item)
        var tvName : TextView = itemView.findViewById(R.id.tv_item_name)
    }
}