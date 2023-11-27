package com.myunidays.newrelik

actual class NewRelic internal constructor(ios: cocoapods.NewRelicAgent.NewRelic){
    actual fun start() {
        // no need to do anything here for ios, simply a polyfill for Android
    }

    actual companion object {
        actual fun withApplicationToken(token: String): NewRelic {
            val newRelic = cocoapods.NewRelicAgent.NewRelic.new()!!
            cocoapods.NewRelicAgent.NewRelic.startWithApplicationToken(token)
            return NewRelic(newRelic)
        }
    }

}
