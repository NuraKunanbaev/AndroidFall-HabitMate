package com.example.habitmate.navigation

import android.view.MenuItem
import androidx.navigation.NavController

class BottomNavHandler(
    private val navController: NavController
) {
    fun handleNavigation(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.home -> {
                navController.navigate(R.id.homeFragment)
                true
            }
            R.id.statistics -> {
                navController.navigate(R.id.statisticsFragment)
                true
            }
            R.id.settings -> {
                navController.navigate(R.id.settingsFragment)
                true
            }
            else -> false
        }
    }
}
