package com.example.finalprojectremake.util

import com.example.finalprojectremake.BuildConfig

object AppConstants {
    var clientId_api_key: String = BuildConfig.clientId_api_key
    var clientSecret_api_key: String = BuildConfig.clientSecret_api_key
    const val URL = "https://us.battle.net/oauth/token"
}