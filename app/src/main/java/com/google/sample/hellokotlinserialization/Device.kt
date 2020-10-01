package com.google.sample.hellokotlinserialization

import androidx.annotation.Keep
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class Device (
    val name: String,
    val brand: String
)