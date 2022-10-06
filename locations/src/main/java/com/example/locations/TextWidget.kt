package com.example.locations

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.example.base.models.TextPresModel
import com.example.courseprojectrickandmorty.utils.goneIf
import com.friendly.universal_recycler.ItemData
import com.friendly.universal_recycler.Widget

class TextWidget(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs),
    Widget {

    private var cvItem: CardView? = null
    private var tvText: TextView? = null
    private var tvDate: TextView? = null
    private var tvEpisode: TextView? = null

    init {
        inflate(context, R.layout.w_text, this)
        cvItem = findViewById(R.id.cvItem)
        tvText = findViewById(R.id.tvText)
        tvDate = findViewById(R.id.tvDate)
        tvEpisode = findViewById(R.id.tvEpisode)
    }

    override fun setData(item: ItemData) {
        item as TextPresModel

        tvText?.text = item.text
        tvDate?.text = item.date
        tvEpisode?.text = item.episode

        tvDate?.goneIf(item.date.isNullOrEmpty())
        tvEpisode?.goneIf(item.episode.isNullOrEmpty())

        setOnClickListener {
            item.onClick(item)
        }

    }

}