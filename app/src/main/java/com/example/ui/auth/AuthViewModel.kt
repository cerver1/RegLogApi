package com.example.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.network.Resources
import com.example.repository.AuthRepository
import com.example.responses.LoginResponse
import com.example.ui.base.BaseViewModel
import kotlinx.coroutines.launch

class AuthViewModel(
    private val repository: AuthRepository
) : BaseViewModel(repository) {


    private val _loginResponse: MutableLiveData<Resources<LoginResponse>> = MutableLiveData()
    val loginResponse: LiveData<Resources<LoginResponse>>
        get() = _loginResponse


    fun login(
        email: String,
        password: String
    ) = viewModelScope.launch {
        _loginResponse.value = repository.login(email, password)

    }


    suspend fun saveAuthToken(token: String) {

        repository.saveAuthToken(token)


    }


}