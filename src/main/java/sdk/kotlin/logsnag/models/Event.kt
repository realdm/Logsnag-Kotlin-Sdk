package sdk.kotlin.logsnag.models

import com.squareup.moshi.Json
import sdk.kotlin.logsnag.models.Tags

data class Event(
    val tags: Tags?,
    val icon: String,
    val event: String,
    val project: String,
    val channel: String,
    val notify: Boolean,
    val description: String,
    @Json(name = "user_id") val userId: String? = null
)