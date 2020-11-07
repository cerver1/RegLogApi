package com.example.repository

import com.example.network.AuthApi

class SignUpRepository(
    val api: AuthApi
) : BaseRepository() {

    suspend fun singup(name: String, email: String, password: String, confirm_password: String) =
        safeApiCall {

            api.signup(name, email, password, confirm_password)

        }
}