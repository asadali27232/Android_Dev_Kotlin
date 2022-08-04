package com.example.unitconverter.converter

import kotlin.math.PI

class Angle(private val source: String, private val target: String, private val input: Double) {
    fun convert(): Double {
        return when (source) {
            "Degree" -> convertDegree()
            "Radian" -> convertRadian()
            else -> 0.0
        }
    }

    private fun convertDegree(): Double {
        return when (target) {
            "Degree" -> input
            "Radian" -> input * (PI / 180)
            else -> 0.0
        }
    }

    private fun convertRadian(): Double {
        return when (target) {
            "Radian" -> input
            "Degree" -> input * (180 / PI)
            else -> 0.0
        }
    }
}