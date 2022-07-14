package com.example.courseprojectrickandmorty.widgets

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.ProgressBar
import androidx.recyclerview.widget.RecyclerView
import com.example.base.R
import com.example.courseprojectrickandmorty.utils.goneIf

class ListWidget(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    private var itemRecyclerAdapter: ItemRecyclerAdapter
    private var items: RecyclerView
    private val progressView: ProgressBar

    init {
        inflate(context, R.layout.w_list, this)
        items = findViewById(R.id.items)
        progressView = findViewById(R.id.progress)
        itemRecyclerAdapter = ItemRecyclerAdapter()
        with(items) {
            adapter = itemRecyclerAdapter
        }
    }

    fun setDataHideProgress(list: MutableList<WidgetItem>) {
        setData(list)
        setProgress(false)
    }

    private fun setData(list: MutableList<WidgetItem>) {
        items.removeAllViews()
        itemRecyclerAdapter.updateItems(list)
        items goneIf (list.size == 0)
    }

    private fun setProgress(progress: Boolean) {
        progressView goneIf !progress
    }

}