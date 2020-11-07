package com.example.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.network.Resources
import com.example.repository.SignUpRepository
import com.example.ui.base.BaseViewModel
import kotlinx.coroutines.launch
import okhttp3.ResponseBody

class SignUpViewmodel(
    private val repository: SignUpRepository
) : BaseViewModel(repository) {

    private val _signupResponse: MutableLiveData<Resources<ResponseBody>> = MutableLiveData()
    val signupResponse: LiveData<Resources<ResponseBody>>
        get() = _signupResponse

    fun signup(
        name: String,
        email: String,
        password: String,
        password_confirmation: String
    ) = viewModelScope.launch {
        _signupResponse.value = repository.singup(name, email, password, password_confirmation)


    }

} 