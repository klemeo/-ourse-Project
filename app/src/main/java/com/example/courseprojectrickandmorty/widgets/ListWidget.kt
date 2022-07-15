package com.example.courseprojectrickandmorty.widgets

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.ProgressBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.courseprojectrickandmorty.R
import com.example.courseprojectrickandmorty.utils.goneIf

class ListWidget(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    private var itemRecyclerAdapter: ItemRecyclerAdapter
    private var items: RecyclerView
    private val progressView: ProgressBar

    private var loadMore: MyLoadMore? = null

    init {
        inflate(context, R.layout.w_list, this)
        items = findViewById(R.id.items)
        progressView = findViewById(R.id.progress)
        itemRecyclerAdapter = ItemRecyclerAdapter()
        with(items) {
            adapter = itemRecyclerAdapter
        }
        onScrolled()
    }

    fun setLoad(loadMore: MyLoadMore?) {
        this.loadMore = loadMore
    }

    fun setDataHideProgress(list: MutableList<WidgetItem>) {
        setData(list)
        setProgress(false)
    }

    fun setProgressAndItems(progress: Boolean) {
        items goneIf progress
        progressView goneIf !progress
    }

    private fun setData(list: MutableList<WidgetItem>) {
        items.removeAllViews()
        itemRecyclerAdapter.updateItems(list)
        items goneIf (list.size == 0)
    }

    private fun setProgress(progress: Boolean) {
        progressView goneIf !progress
    }

    private fun onScrolled() {
        val layoutManager = items.layoutManager as LinearLayoutManager
        items.addOnScrollListener(object : RecyclerView.OnScrollListener() {

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)

                val totalItemCount = layoutManager.itemCount
                val lastVisibleItem = layoutManager.findLastVisibleItemPosition()
                if (totalItemCount == lastVisibleItem +1 ) {
                    loadMore?.onLoadMore()
                }
            }
        })
    }

}

interface MyLoadMore {
    fun onLoadMore()
}