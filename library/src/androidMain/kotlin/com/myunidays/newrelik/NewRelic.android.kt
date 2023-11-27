package com.myunidays.newrelik

actual class NewRelic internal constructor(val android: com.newrelic.agent.android.NewRelic){

    actual fun start() {
//        android.start()
    }

    actual companion object {
        actual fun withApplicationToken(token: String): NewRelic =
            NewRelic(com.newrelic.agent.android.NewRelic.withApplicationToken(token))
    }
}
