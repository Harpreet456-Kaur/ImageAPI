package com.example.imageapi.api

import com.example.imageapi.api.utils.CommonKeys.API_CONTENT
import com.example.imageapi.api.utils.CommonKeys.API_HOST
import com.example.imageapi.api.utils.CommonKeys.API_KEY
import com.example.imageapi.api.utils.CommonKeys.GET_DATE
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface APInterface {

    @POST(GET_DATE)
    @Headers(
        "X-RapidAPI-Key:$API_KEY",
        "X-RapidAPI-Host:$API_HOST",
        "X-RapidAPI-CONTENT:$API_CONTENT"
    )
    fun getData(@Body gson: String): Call<MyData>
}