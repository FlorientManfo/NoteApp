package com.example.noteapp.feature_note.domain.use_case

data class NoteUseCases(
    val getNotes: GetNotes,
    val addNote: AddNote,
    val deleteNote: DeleteNote,
    val getNote: GetNote
)