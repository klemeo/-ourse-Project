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
    private var isLoading = false

    private var listSize: Int = 1

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

    private fun startLoading() {
        isLoading = true
    }

    private fun setLoaded() {
        isLoading = false
    }

    fun setDataHideProgress(list: MutableList<WidgetItem>, clear: Boolean = true, size: Int = 1) {
        this.listSize = size
        setData(list, clear)
        setProgress(false)
    }

    fun setProgressAndItems(progress: Boolean) {
        items goneIf progress
        progressView goneIf !progress
    }

    private fun setData(list: MutableList<WidgetItem>, clear: Boolean) {
        with(itemRecyclerAdapter) {
            if (clear) {
                removeAllViews()
                updateItems(list)
            } else {
                addItems(list)
                setLoaded()
            }
        }
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

                val itemCount = layoutManager.itemCount
                val lastVisibleItem = layoutManager.findLastVisibleItemPosition()

                if (!isLoading && itemCount != listSize) {
                    if (itemCount < lastVisibleItem + 10) {
                        startLoading()
                        loadMore?.onLoadMore()
                    }
                }
            }
        })
    }

}

interface MyLoadMore {
    fun onLoadMore()
}