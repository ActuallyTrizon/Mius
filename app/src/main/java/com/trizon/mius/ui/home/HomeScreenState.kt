package com.trizon.mius.ui.home

import com.trizon.mius.data.model.ExampleModel

/**
 * Single, exhaustive representation of everything [MainScreen] can render.
 * The ViewModel exposes exactly one [HomeUiState] at a time via a [kotlinx.coroutines.flow.StateFlow],
 * following a unidirectional data flow (UDF): Event -> ViewModel -> UiState -> Composable.
 */
sealed interface HomeUiState {
    data object Idle : HomeUiState
    data object Loading : HomeUiState
    data class Success(val items: List<ExampleModel>) : HomeUiState
    data class Error(val message: String) : HomeUiState
}

/** User intents that [MainScreen] can dispatch to [HomeViewModel]. */
sealed interface HomeEvent {
    data object LoadExamples : HomeEvent
}
