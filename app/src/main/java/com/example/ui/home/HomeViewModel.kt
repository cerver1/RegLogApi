package com.example.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.network.Resources
import com.example.repository.UserRepository
import com.example.responses.LoginResponse
import com.example.ui.base.BaseViewModel
import kotlinx.coroutines.launch


class HomeViewModel(
    private val userRepository: UserRepository
) : BaseViewModel(userRepository) {


    private val _user: MutableLiveData<Resources<LoginResponse>> = MutableLiveData()
    val user: LiveData<Resources<LoginResponse>>
        get() = _user


    fun getUser() = viewModelScope.launch {
        _user.value = Resources.loading
        _user.value = userRepository.getUser()

    }


}