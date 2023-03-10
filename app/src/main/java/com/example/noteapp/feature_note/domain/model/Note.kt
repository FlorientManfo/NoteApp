package com.example.noteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.noteapp.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey(autoGenerate = false) val id: Int? = null
){
    companion object{
        val noteColors = listOf(
            RedOrange,
            LightGreen,
            Violate,
            BabyBlue,
            RedPik
        )
    }
}

 class InvalidNoteException(message: String): Exception(message)
