package com.trizon.todoro.ui.home

import com.trizon.todoro.data.model.ExampleModel

sealed interface HomeUiState {
    data object Idle : HomeUiState
    data object Loading : HomeUiState
    data class Success(val items: List<ExampleModel>) : HomeUiState
    data class Error(val message: String) : HomeUiState
}

sealed interface HomeEvent {
    data object LoadExamples : HomeEvent
}
