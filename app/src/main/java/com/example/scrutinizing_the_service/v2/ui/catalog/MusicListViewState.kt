package com.example.scrutinizing_the_service.v2.ui.catalog

import com.example.scrutinizing_the_service.data.Song

data class MusicListViewState(
    var progress: Float = 0f,
    var loading: Boolean = false,
    var duration: Long = 1L,
    var progressString: String = "00:00",
    var currentSong: Song? = null,
    var isPlaying: Boolean = false,
    var isConnected: Boolean = false,
)