package com.friendly.universal_recycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView

open class ItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    open fun setData(item: ItemData) {
        val widget: Widget = itemView.findViewById(R.id.widget)
        widget.setData(item)
    }
}