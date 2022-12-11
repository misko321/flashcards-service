package pl.misko321.flashcards.flashcards

import io.restassured.common.mapper.TypeRef
import io.restassured.module.kotlin.extensions.Extract
import io.restassured.module.kotlin.extensions.Then
import io.restassured.module.kotlin.extensions.When
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FlashcardsControllerIntegrationTest : BaseIntegrationTest() {

    @Test
    fun get() {
        val response =
            When {
                get("/hello")
            } Then {
                statusCode(200)
            } Extract {
                `as`(object : TypeRef<List<Flashcard>>() {})
            }
        assertThat(response).isEmpty()
    }

    @Test
    fun post() {
        When {
            post("/hello")
        } Then {
            statusCode(201)
        }
        val response =
            When {
                get("/hello")
            } Then {
                statusCode(200)
            } Extract {
                `as`(object : TypeRef<List<Flashcard>>() {})
            }
        assertThat(response).hasSize(1)
    }
}