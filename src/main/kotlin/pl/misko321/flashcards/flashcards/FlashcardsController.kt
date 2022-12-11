package pl.misko321.flashcards.flashcards

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import java.time.Instant
import java.util.*

@RestController
class FlashcardsController(
    private val flashcardRepository: FlashcardRepository
) {
    @GetMapping("/hello")
    fun get(): ResponseEntity<Iterable<Flashcard>> {
        return ResponseEntity.ok(flashcardRepository.findAll())
    }

    @PostMapping("/hello")
    fun post(): ResponseEntity<Void> {
        flashcardRepository.save(Flashcard(UUID.randomUUID(), "front", "back", Instant.now(), Instant.now()))
        return ResponseEntity.status(HttpStatus.CREATED.value()).build()
    }
}