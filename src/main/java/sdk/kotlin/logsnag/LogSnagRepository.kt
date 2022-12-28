package sdk.kotlin.logsnag

import com.squareup.moshi.KotlinJsonAdapterFactory
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import sdk.kotlin.logsnag.models.Event

class LogSnagRepository(private val token: String) : LogSnagService {

    private val moshi by lazy {
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()
    }

    private val logSnagApi by lazy {
        retrofit.create(LogSnagApi::class.java)
    }


    private val retrofit by lazy {
        val okHttp = OkHttpClient.Builder()
            .addInterceptor(HttpInterceptor(token))
            .build()
        Retrofit.Builder()
            .client(okHttp)
            .baseUrl(LogSnagApi.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
    }

    override suspend fun logEvent(event: Event) {
        logSnagApi.log(event)
    }
}