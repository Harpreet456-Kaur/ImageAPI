package com.example.imageapi.api

data class MyData(
    val apiKeyUsed: String,
    val bandwidthCost: Int,
    val error: String,
    val id: String,
    val params: Params,
    val processTime: Int,
    val processTimeCost: Int,
    val self: String,
    val size: Int,
    val status: String,
    val timestamp: Long,
    val totalCost: Int,
    val type: String,
    val uid: String,
    val userId: String,
    val workerName: String
)