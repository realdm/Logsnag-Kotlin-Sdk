package sdk.kotlin.logsnag

import sdk.kotlin.logsnag.models.Event
import sdk.kotlin.logsnag.models.Identity

interface LogSnagService {
    suspend fun logEvent(event: Event)
    suspend fun identify(identity: Identity)
}