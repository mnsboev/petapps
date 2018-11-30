package com.petapps.chat.repository

import com.petapps.chat.entity.Article
import com.petapps.chat.entity.User
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, Long> {
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}

interface UserRepository : CrudRepository<User, String>