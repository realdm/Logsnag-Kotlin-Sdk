# Logsnag-Kotlin-Sdk
A lightweight sdk for logsnag

# Easy setup

## initialize the SDK

Head to logsnag.com, create a new account and get an access token.

```kotlin
val sdk = LogSnagSdk.init("<add your token >")
```

## Log the events
```kotlin
sdk.logEvent(
        Event(
            icon = "🦄",
            tags = null,
            notify = true,
            event = "<event_name>",
            project = "<your_project_name>",
            channel = "<your_channel_name>",
            description = "<event_description>"
        )
    )
```
