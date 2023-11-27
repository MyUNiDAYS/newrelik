package com.myunidays.newrelik

expect class NewRelic {

    fun start() // going to need to pass in a context here for android

    companion object {
        fun withApplicationToken(token: String): NewRelic
    }
}