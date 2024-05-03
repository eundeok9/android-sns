package com.example.data.model

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody

@Serializable
data class LoginParam(
    val loginId: String,
    val password: String,
) {
    // requestBody로 변환
    fun toRequestBody(): RequestBody {
        return Json.encodeToString(this).toRequestBody()
    }
}