package sdk.kotlin.logsnag.models

import com.squareup.moshi.Json

data class Event(
    val icon: String,
    val event: String,
    val project: String,
    val channel: String,
    val notify: Boolean,
    val description: String,
    val tags: Map<String, String>,
    @Json(name = "user_id") val userId: String? = null
)