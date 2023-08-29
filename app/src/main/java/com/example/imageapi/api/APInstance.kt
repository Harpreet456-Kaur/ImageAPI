package com.example.imageapi.api

import com.example.imageapi.api.utils.CommonKeys.BASE_URL
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object APInstance {
//    var gson = GsonBuilder()
//        .setLenient()
//        .create()
//    val client: OkHttpClient = OkHttpClient.Builder()
//        .build()

    fun apiInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            //.client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}