package com.myunidays.newrelik

expect class NewRelic {

    companion object {
        fun withApplicationToken(token: String): NewRelic
    }
}