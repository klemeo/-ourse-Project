package com.example.courseprojectrickandmorty.utils

import android.view.View

infix fun View.goneIf(expr: Boolean) {
    visibility = if (expr) View.GONE else View.VISIBLE
}