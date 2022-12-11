package pl.misko321.flashcards.flashcards

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface FlashcardRepository : CrudRepository<Flashcard, UUID>