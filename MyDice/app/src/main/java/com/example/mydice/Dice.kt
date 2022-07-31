package com.example.mydice

class Dice(private val numberOfSides: Int) {
    fun roll(): Int{
        return (1..numberOfSides).random()
    }
}