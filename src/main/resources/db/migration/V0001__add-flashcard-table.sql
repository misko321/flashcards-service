CREATE TABLE IF NOT EXISTS flashcards.flashcard
(
    id         UUID NOT NULL PRIMARY KEY,
    front      VARCHAR(200),
    back       VARCHAR(200),
    created_at TIMESTAMP WITH TIME ZONE,
    updated_at TIMESTAMP WITH TIME ZONE
)