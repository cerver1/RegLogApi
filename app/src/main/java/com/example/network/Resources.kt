package com.example.network

import okhttp3.ResponseBody

sealed class Resources<out T> {

    data class Success<out T>(val value: T) : Resources<T>()

    data class Failure(
        val isNetworkError: Boolean,
        val Code: Int?,
        val errorBody: ResponseBody?
    ) : Resources<Nothing>()

    object loading : Resources<Nothing>()


}