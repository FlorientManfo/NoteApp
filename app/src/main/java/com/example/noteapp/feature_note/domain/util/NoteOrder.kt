package com.example.noteapp.feature_note.domain.util

sealed class NoteOrder(val orderType: OrderType){
    class Tile(orderType: OrderType): NoteOrder(orderType)
    class Date(orderType: OrderType): NoteOrder(orderType)
    class Color(orderType: OrderType): NoteOrder(orderType)
}
