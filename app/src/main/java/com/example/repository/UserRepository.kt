package com.example.repository

import com.example.network.UserApi


class UserRepository(
    private val userApi: UserApi
) : BaseRepository() {

    suspend fun getUser() = safeApiCall {
        userApi.getuser()
    }


}