package com.petapps.chat.entity

import javax.persistence.*

@Entity
@Table(name = "users")
data class User (
        @Id @GeneratedValue(strategy=GenerationType.AUTO) val id: Long? = null,
        val name: String,
        val phone: Int,
        val email: String? = null,
        @ManyToMany(fetch = FetchType.EAGER)
        @JoinTable(name = "UsersDialogs",
                joinColumns = [JoinColumn(name = "userId", referencedColumnName = "id")],
                inverseJoinColumns = [JoinColumn(name = "dialogId", referencedColumnName = "id")])
        val dialogs: List<Dialog>? = emptyList()
)