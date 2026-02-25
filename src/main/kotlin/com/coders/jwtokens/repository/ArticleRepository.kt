package com.coders.jwtokens.repository

import com.coders.jwtokens.model.Article
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class ArticleRepository {
    private val articles = listOf(
        Article(id= UUID.randomUUID(), title = "Aricle 1", content = "Contente 1"),
        Article(id= UUID.randomUUID(), title = "Aricle 2", content = "Contente 2"),

    )

    fun findAll(): List<Article> =
        articles
}