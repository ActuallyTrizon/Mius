package com.trizon.mius.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.trizon.mius.ui.detail.DetailScreen
import com.trizon.mius.ui.home.MainScreen

@Composable
fun NavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.Main,
    ) {

        composable<Screen.Main> {
            MainScreen(navController = navController)
        }

        composable<Screen.Detail> { backStackEntry ->
            val detail: Screen.Detail = backStackEntry.toRoute()
            DetailScreen(navController = navController, id = detail.id)
        }
    }
}
