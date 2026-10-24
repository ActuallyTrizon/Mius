package com.trizon.todoro.navigation

import kotlinx.serialization.Serializable

sealed interface Screen {

    @Serializable
    data object Main : Screen

    @Serializable
    data class Detail(val id: Int) : Screen
}
