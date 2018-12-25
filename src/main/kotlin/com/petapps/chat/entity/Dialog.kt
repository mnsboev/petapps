package com.petapps.chat.entity

import javax.persistence.*
import javax.persistence.CascadeType.*

@Entity
@Table(name = "dialogs")
data class Dialog (
        @Id @GeneratedValue(strategy=GenerationType.AUTO) val id: Long? = null,
        @ManyToMany(mappedBy = "dialogs")
        val users: List<User>,
        @OneToMany
        @JoinColumn(name = "dialogId", referencedColumnName = "id")
        val messages: List<Message> = emptyList(),
        val title: String
)