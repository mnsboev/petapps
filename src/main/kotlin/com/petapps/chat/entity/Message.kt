package com.petapps.chat.entity

import java.time.ZonedDateTime
import javax.persistence.*

@Entity
@Table(name = "messages")
data class Message (
        @Id @GeneratedValue(strategy=GenerationType.AUTO)
        val id: Long? = null,
        @ManyToOne
        @JoinColumn(name = "userId", referencedColumnName = "id")
        val user: User,
        val date: ZonedDateTime,
        val message: String
        )