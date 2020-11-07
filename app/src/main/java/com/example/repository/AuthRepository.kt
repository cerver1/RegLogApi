package com.example.repository

import com.example.data.UserPreferences
import com.example.network.AuthApi


class AuthRepository(
    val api: AuthApi,
    val userPreferences: UserPreferences
) : BaseRepository() {

    suspend fun login(email: String, password: String) = safeApiCall {

        api.login(email, password)

    }


    suspend fun saveAuthToken(token: String) {
        userPreferences.saveAuthToken(token)


    }
}