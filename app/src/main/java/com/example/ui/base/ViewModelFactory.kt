package com.example.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.repository.AuthRepository
import com.example.repository.BaseRepository
import com.example.repository.SignUpRepository
import com.example.repository.UserRepository
import com.example.ui.auth.AuthViewModel
import com.example.ui.auth.SignUpViewmodel
import com.example.ui.home.HomeViewModel

@Suppress("UNCHECKED_CAST")
class ViewModelFactory(
    private val repository: BaseRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(AuthViewModel::class.java) -> AuthViewModel(repository as AuthRepository) as T
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> HomeViewModel(repository as UserRepository) as T
            modelClass.isAssignableFrom(SignUpViewmodel::class.java) -> SignUpViewmodel(repository as SignUpRepository) as T
            else -> throw IllegalAccessException("ViewModel not found")

        }
    }
}