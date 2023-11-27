package com.myunidays.newrelik

actual class NewRelic internal constructor(android: com.newrelic.agent.android.NewRelic){
    actual companion object {
        actual fun withApplicationToken(token: String): NewRelic =
            NewRelic(com.newrelic.agent.android.NewRelic.withApplicationToken(token))
    }

}