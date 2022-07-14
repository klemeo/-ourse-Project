package com.example.courseprojectrickandmorty.ui

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.example.courseprojectrickandmorty.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private var tabAdapter: MainTabAdapter? = null

    private var vpTabs: ViewPager? = null
    private var vNavigate: BottomNavigationView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vpTabs = findViewById(R.id.vpTabs)
        vNavigate = findViewById(R.id.vNavigate)

        makeStatusBarLight()
        initViews()
    }

    private fun initViews() {
        tabAdapter = MainTabAdapter(supportFragmentManager)
        vNavigate?.setOnItemSelectedListener {
            val position = TabBinder.getPositionByItemId(it.itemId)
            vpTabs?.setCurrentItem(position, false)
            true
        }
        vpTabs?.apply {
            offscreenPageLimit = TabBinder.TABS_COUNT
            adapter = tabAdapter
            setCurrentItem(TabBinder.START_POSITION, false)
        }
    }

    private fun makeStatusBarLight() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility = window.decorView.systemUiVisibility or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            window.statusBarColor = Color.WHITE
        }
    }
}