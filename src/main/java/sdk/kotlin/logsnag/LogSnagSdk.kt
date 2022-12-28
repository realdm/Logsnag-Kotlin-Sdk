package sdk.kotlin.logsnag

import sdk.kotlin.logsnag.models.Event

object LogSnagSdk {

    private var _token: String? = null

    fun init(token: String): LogSnagSdk {
        _token = token
        return this
    }

    private val logSnagRepository by lazy {
        val token =
            _token ?: throw IllegalStateException("Access tokens must be set before logging events")
        LogSnagRepository(token)
    }

    suspend fun logEvent(event: Event) {
        logSnagRepository.logEvent(event)
    }

}