# Logsnag-Kotlin-Sdk
A lightweight sdk for logsnag

# Easy setup

## Add the sdk dependencies to your project

Add it in your root build.gradle at the end of repositories:
```groovy
allprojects {
  repositories {
      maven { url 'https://jitpack.io' }
   }
}
```

Add the dependency to your project
```groovy
dependencies {
  implementation 'com.github.realdm:Logsnag-Kotlin-Sdk:Tag'
}
```

## initialize the SDK

Head to [logsnag](logsnag.com), create a new account and get an access token.

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
