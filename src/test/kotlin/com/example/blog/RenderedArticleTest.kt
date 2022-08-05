package com.example.blog

import org.junit.jupiter.api.Assertions.assertNotEquals
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

class RenderedArticleTest {
    @Test
    fun dataClassTests() {
        val article1 = HtmlController.RenderedArticle(
            slug = "some-slug",
            addedAt = LocalDateTime.now().format(),
            content = "this is the content lol",
            title = "this is the title",
            headline = "clickbait headline",
            author = User(
                login = "rm025953",
                firstname = "rob",
                lastname = "marlow"
            )
        )

        val article2 = HtmlController.RenderedArticle(
            slug = "another-slug",
            addedAt = LocalDateTime.now().format(),
            content = "this is the content lol",
            title = "this is the title",
            headline = "another clickbait headline",
            author = User(
                login = "rm025953",
                firstname = "rob",
                lastname = "marlow"
            )
        )

        val article2Copy = article2.copy(headline = "better clickbait headline")

        assertNotEquals(article1, article2)
        assertNotEquals(article2, article2Copy)
    }
}
