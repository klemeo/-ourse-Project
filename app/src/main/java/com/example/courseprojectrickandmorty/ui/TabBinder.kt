package com.example.courseprojectrickandmorty.ui

import androidx.fragment.app.Fragment
import com.example.courseprojectrickandmorty.R
import com.example.characters.CharactersFragment
import com.example.episodes.EpisodesFragment
import com.example.locations.LocationsFragment

object TabBinder {

    private const val POSITION_LOCATIONS = 0
    private const val POSITION_CHARACTERS = 1
    private const val POSITION_EPISODES = 2

    const val TABS_COUNT = 3
    const val START_POSITION = POSITION_CHARACTERS

    fun getPositionByItemId(itemId: Int) = when (itemId) {
        R.id.f_locations -> POSITION_LOCATIONS
        R.id.f_characters -> POSITION_CHARACTERS
        R.id.f_episodes -> POSITION_EPISODES
        else -> throw IllegalAccessException("Unknown itemId: $itemId")
    }

    fun getFragmentByPosition(position: Int): Fragment = when (position) {
        POSITION_LOCATIONS -> LocationsFragment()
        POSITION_CHARACTERS -> CharactersFragment()
        POSITION_EPISODES -> EpisodesFragment()
        else -> throw IllegalAccessException("Unknown position: $position")
    }

    fun getPositionByItem(position: Int) = when (position) {
        POSITION_LOCATIONS -> R.id.f_locations
        POSITION_CHARACTERS -> R.id.f_characters
        POSITION_EPISODES -> R.id.f_episodes
        else -> throw IllegalAccessException("Unknown position: $position")
    }
}