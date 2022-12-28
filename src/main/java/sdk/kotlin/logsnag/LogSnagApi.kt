package sdk.kotlin.logsnag

import sdk.kotlin.logsnag.models.Event
import retrofit2.http.Body
import retrofit2.http.POST

interface LogSnagApi {

    companion object {
        const val BASE_URL = "https://api.logsnag.com/"
    }

    @POST("v1/log")
    suspend fun log(@Body body: Event): Unit

}