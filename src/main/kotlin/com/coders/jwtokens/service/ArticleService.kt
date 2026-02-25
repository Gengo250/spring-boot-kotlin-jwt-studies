package com.coders.jwtokens.service

import com.coders.jwtokens.model.Article
import com.coders.jwtokens.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService (
    private val articleRepository: ArticleRepository
){
    fun findAll(): List<Article> =
        articleRepository.findAll()
}