package com.example.scrutinizing_the_service.v2.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.scrutinizing_the_service.data.Song
import com.example.scrutinizing_the_service.v2.data.MusicRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MusicListViewModel @Inject constructor(
    private val musicRepository: MusicRepository
) : ViewModel() {

    lateinit var songs: List<Song>

    private val _loading = MutableStateFlow(false)
    val loading = _loading.asStateFlow()

    init {
        getDeviceAudios()
    }

    private fun getDeviceAudios() {
        viewModelScope.launch {
            _loading.value = true
            songs = musicRepository.getMusic()
            _loading.value = false
        }
    }

}