package com.trizon.todoro.ui.detail

sealed interface DetailUiState {
    data object Loading : DetailUiState
    data class Content(val id: Int) : DetailUiState
}

sealed interface DetailEvent {
    data class LoadDetail(val id: Int) : DetailEvent
}
