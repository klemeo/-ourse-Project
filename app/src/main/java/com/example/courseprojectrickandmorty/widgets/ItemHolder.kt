package com.example.courseprojectrickandmorty.widgets

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.courseprojectrickandmorty.R

open class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    open fun setData(item: ItemData) {
        val widget: Widget = itemView.findViewById(R.id.widget)
        widget.setData(item)
    }
}