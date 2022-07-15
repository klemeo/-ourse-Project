package com.example.courseprojectrickandmorty.widgets

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.example.courseprojectrickandmorty.R

class ItemRecyclerAdapter : RecyclerView.Adapter<ItemHolder>() {

    private var itemList = mutableListOf<WidgetItem>()

    fun updateItems(items: MutableList<WidgetItem>) {
        this.itemList.clear()
        this.itemList.addAll(items)
        notifyDataSetChanged()
    }

    fun addItems(items: MutableList<WidgetItem>) {
        this.itemList.addAll(items)
        notifyItemInserted(this.itemCount)
    }

    fun removeItem(widgetItem: WidgetItem) {
        notifyItemRemoved(itemList.indexOf(widgetItem))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val layout = LayoutInflater.from(parent.context)
            .inflate(viewType, parent, false)
        return ItemHolder(layout)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.setData(itemList[position].itemData)
        holder.itemView.animation =
            AnimationUtils.loadAnimation(holder.itemView.context, R.anim.w_items_anims)

    }

    override fun getItemViewType(position: Int): Int = itemList[position].res

    override fun getItemCount(): Int = itemList.size

    fun getAll(): MutableList<WidgetItem> {
        return itemList
    }

}