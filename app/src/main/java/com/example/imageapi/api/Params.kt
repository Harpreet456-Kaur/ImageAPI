package com.example.imageapi.api

data class Params(
    val async: Boolean,
    val delay: Int,
    val generatePreview: Boolean,
    val imageType: String,
    val quality: Int,
    var subType: String,
    var timeout: Int,
    val type: String,
    var url: String,
    val waitUntil: String
)
