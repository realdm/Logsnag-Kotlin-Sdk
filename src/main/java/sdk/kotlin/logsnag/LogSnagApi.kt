package sdk.kotlin.logsnag

import sdk.kotlin.logsnag.models.Event
import retrofit2.http.Body
import retrofit2.http.POST
import sdk.kotlin.logsnag.models.Identity

interface LogSnagApi {

    companion object {
        const val BASE_URL = "https://api.logsnag.com/"
    }

    @POST("v1/log")
    suspend fun log(@Body body: Event): Unit

    @POST("v1/identify")
    suspend fun identify(@Body body: Identity): Unit

}