package com.petapps.chat

import com.petapps.chat.entity.Dialog
import com.petapps.chat.entity.Message
import com.petapps.chat.entity.User
import com.petapps.chat.repository.DialogRepository
import com.petapps.chat.repository.MessageRepository
import com.petapps.chat.repository.UserRepository
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension
import java.time.Clock
import java.time.ZoneId
import java.time.ZonedDateTime
import javax.transaction.Transactional

@ExtendWith(SpringExtension::class)
@SpringBootTest
class DBTest (@Autowired val userRepository: UserRepository,
              @Autowired val messageRepository: MessageRepository,
              @Autowired val dialogRepository: DialogRepository) {



    @Test
    fun insertTest() {
        var user = User(name = "Hello", phone = 89333442, email = "abc@mail.ru")
        userRepository.save(user)
        val dialog = Dialog(title = "Hello Title", users = listOf(user))
        dialogRepository.save(dialog)
        val message = Message(
                user = user,
                date = ZonedDateTime.now(Clock.system(ZoneId.of("Europe/Moscow"))),
                message = "Hello Message")
        messageRepository.save(message)
    }
}