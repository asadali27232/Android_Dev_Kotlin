package com.example.contactsrecyclerview.util

object ColorPicker {
    private val colors = listOf<String>(
        "#F50057",
        "#AA00ff",
        "#6200EA",
        "#00B8D4",
        "#2E7D32",
        "#212121",
        "#263238"
    )
    var currentColorIndex = 0

    fun getCardColor(): String {
        currentColorIndex = (currentColorIndex + 1) % colors.size
        return colors[currentColorIndex]
    }
}