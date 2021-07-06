package com.dicoding.mysubmission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import org.w3c.dom.Text

class ListInstrumentAdapter(private val listInstrument:ArrayList<Instrument>): RecyclerView.Adapter<ListInstrumentAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }


    override fun onCreateViewHolder(viewGroup:ViewGroup, i: Int): ListViewHolder {
        val view:View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_instrument,viewGroup,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val instrument = listInstrument[position]

        Glide.with(holder.itemView.context)
            .load(instrument.photo)
            .apply(RequestOptions().override(65, 65))
            .into(holder.itemImg)

        holder.tvName.text = instrument.name
        holder.tvDetail.text = instrument.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listInstrument[holder.adapterPosition]) }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Instrument)
    }

    override fun getItemCount(): Int {
        return listInstrument.size
    }
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var tvName:TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail:TextView = itemView.findViewById(R.id.tv_item_detail)
        var itemImg:ImageView = itemView.findViewById(R.id.img_item)


    }

}