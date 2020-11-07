package com.example.network

import com.example.responses.LoginResponse
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.POST

interface UserApi {

    @GET("user")
    suspend fun getuser(): LoginResponse

    @POST("logout")
    suspend fun logout(): ResponseBody

}