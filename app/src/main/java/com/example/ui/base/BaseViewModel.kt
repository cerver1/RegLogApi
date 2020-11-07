package com.example.ui.base

import androidx.lifecycle.ViewModel
import com.example.network.UserApi
import com.example.repository.BaseRepository

abstract class BaseViewModel(
    private val repository: BaseRepository
) : ViewModel() {


    suspend fun logout(api: UserApi) = repository.logout(api)

}