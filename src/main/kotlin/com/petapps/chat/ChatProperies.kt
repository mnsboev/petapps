package com.petapps.chat

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("chat")
class ChatProperies {

    lateinit var title: String
    val banner = Banner()
    class Banner {
        var title: String? = null
        lateinit var content: String
    }
}