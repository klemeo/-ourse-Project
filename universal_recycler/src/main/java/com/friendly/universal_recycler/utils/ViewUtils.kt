package com.friendly.universal_recycler.utils

import android.view.View

infix fun View.goneIf(expr: Boolean) {
    visibility = if (expr) View.GONE else View.VISIBLE
}