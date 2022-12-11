package pl.misko321.flashcards

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlashcardsServiceApplication

fun main(args: Array<String>) {
    runApplication<FlashcardsServiceApplication>(*args)
}
