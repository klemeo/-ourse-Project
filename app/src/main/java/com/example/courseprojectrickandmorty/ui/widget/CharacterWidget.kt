package com.example.courseprojectrickandmorty.ui.widget

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.bumptech.glide.Glide
import com.example.courseprojectrickandmorty.widgets.ItemData
import com.example.courseprojectrickandmorty.widgets.Widget
import com.example.courseprojectrickandmorty.R
import com.example.courseprojectrickandmorty.ui.characters.CharacterPresModel
import com.example.courseprojectrickandmorty.utils.getColorGreen
import com.example.courseprojectrickandmorty.utils.getColorGrey
import com.example.courseprojectrickandmorty.utils.getColorRed

class CharacterWidget(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs),
    Widget {

    private var cvPostItem: CardView? = null
    private var ivPreview: ImageView? = null
    private var tvName: TextView? = null
    private var tvStatus: TextView? = null
    private var tvLocation: TextView? = null
    private var tvFirstSeen: TextView? = null

    init {
        inflate(context, R.layout.w_character, this)
        cvPostItem = findViewById(R.id.cvPostItem)
        ivPreview = findViewById(R.id.ivPreview)
        tvName = findViewById(R.id.tvName)
        tvStatus = findViewById(R.id.tvStatus)
        tvLocation = findViewById(R.id.tvLocation)
        tvFirstSeen = findViewById(R.id.tvFirstSeen)
    }

    override fun setData(item: ItemData) {
        item as CharacterPresModel

        ivPreview?.let {
            Glide.with(this)
                .load(item.image)
                .into(it)
        }

        tvName?.text = item.name
        tvStatus?.text = item.status
        tvLocation?.text = item.location
        tvFirstSeen?.text = item.origin

        when (item.status) {
            "Alive" -> tvStatus?.getColorGreen()
            "Dead" -> tvStatus?.getColorRed()
            else -> tvStatus?.getColorGrey()
        }

        setOnClickListener {
            item.onClick(item)
        }

    }

}