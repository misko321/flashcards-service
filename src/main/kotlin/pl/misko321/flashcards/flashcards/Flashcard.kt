package pl.misko321.flashcards.flashcards

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.time.Instant
import java.util.UUID

@Entity
class Flashcard(
    @Id
    @GeneratedValue
    val id: UUID,

    val front: String,

    val back: String,

    val createdAt: Instant, // TODO automatically set these dates?

    val updatedAt: Instant
)