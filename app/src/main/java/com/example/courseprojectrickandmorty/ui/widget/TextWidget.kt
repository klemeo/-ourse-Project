package com.example.courseprojectrickandmorty.ui.widget

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.courseprojectrickandmorty.R
import com.example.courseprojectrickandmorty.widgets.ItemData
import com.example.courseprojectrickandmorty.widgets.Widget

class TextWidget(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs),
    Widget {

    private var cvItem: CardView? = null
    private var tvText: TextView? = null

    init {
        inflate(context, R.layout.w_text, this)
        cvItem = findViewById(R.id.cvItem)
        tvText = findViewById(R.id.tvText)
    }

    override fun setData(item: ItemData) {
        item as TextPresModel

        tvText?.text = item.text

        setOnClickListener {
            item.onClick(item)
        }

    }

}