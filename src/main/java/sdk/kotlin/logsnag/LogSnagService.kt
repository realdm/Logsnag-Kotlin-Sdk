package sdk.kotlin.logsnag

import sdk.kotlin.logsnag.models.Event

interface LogSnagService {
    suspend fun logEvent(event: Event)
}