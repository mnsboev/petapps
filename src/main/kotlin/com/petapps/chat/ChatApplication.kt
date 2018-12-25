package com.petapps.chat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(ChatProperies::class)
class ChatApplication {

}


fun main(args: Array<String>) {
    runApplication<ChatApplication>(*args)
}
