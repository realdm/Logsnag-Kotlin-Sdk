package sdk.kotlin.logsnag.models

import com.squareup.moshi.Json

data class Identity(
    val project: String,
    val properties: Map<String, String>,
    @Json(name = "user_id") val userId: String,
)