package com.example.unitconverter.converter

class DigitalStorage(
    private val source: String,
    private val target: String,
    private val input: Double
) {
    fun convert(): Double {
        return when (source) {
            "Bit" -> convertBit()
            "Byte" -> convertByte()
            "Kilobyte" -> convertKilobyte()
            "Megabyte" -> convertMegabyte()
            "Gigabyte" -> convertGigabyte()
            "Terabyte" -> convertTerabyte()
            "Petabyte" -> convertPetabyte()
            else -> 0.0
        }
    }

    private fun convertBit(): Double {
        TODO("Not yet implemented")
    }

    private fun convertByte(): Double {
        TODO("Not yet implemented")
    }

    private fun convertKilobyte(): Double {
        TODO("Not yet implemented")
    }

    private fun convertMegabyte(): Double {
        TODO("Not yet implemented")
    }

    private fun convertGigabyte(): Double {
        TODO("Not yet implemented")
    }


    private fun convertTerabyte(): Double {
        TODO("Not yet implemented")
    }

    private fun convertPetabyte(): Double {
        TODO("Not yet implemented")
    }

}