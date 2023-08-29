package com.example.imageapi.api

data class NewData(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)