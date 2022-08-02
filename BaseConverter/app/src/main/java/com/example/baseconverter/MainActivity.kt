package com.example.baseconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.WorkSource
import android.widget.*
import androidx.appcompat.app.AppCompatDelegate
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dropDown()

        val btnConvert = findViewById<Button>(R.id.btnConvert)
        btnConvert.setOnClickListener {
            convert()
        }
    }

    private fun dropDown() {
        //Getting reference to the array in created in strings.xml and creating an array adapter val
        val bases = resources.getStringArray(R.array.bases)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_menu, bases)

        //Setting dropdown for fromBase
        val fromBase = findViewById<AutoCompleteTextView>(R.id.fromBaseText)
        fromBase.setAdapter(arrayAdapter)

        //Setting dropdown for toBase
        val toBase = findViewById<AutoCompleteTextView>(R.id.toBaseText)
        toBase.setAdapter(arrayAdapter)
    }

    private fun convert() {
        var result = ""

        val number = findViewById<TextView>(R.id.enterNumberText).text.toString()
        val sourceBase = findViewById<TextView>(R.id.fromBaseText).text.toString()
        val targetBase = findViewById<TextView>(R.id.toBaseText).text.toString()

        if (checkInput(number, sourceBase)) {
            when (sourceBase) {
                "Binary" -> {
                    result = when (targetBase) {
                        "Octal" -> decimalToOctal(binaryToDecimal(number))
                        "Decimal" -> binaryToDecimal(number)
                        "Hexadecimal" -> decimalToHexadecimal(binaryToDecimal(number))
                        else -> number
                    }
                }
                "Octal" -> {
                    result = when (targetBase) {
                        "Binary" -> decimalToBinary(octalToDecimal(number))
                        "Decimal" -> octalToDecimal(number)
                        "Hexadecimal" -> decimalToHexadecimal(octalToDecimal(number))
                        else -> number
                    }
                }
                "Decimal" -> {
                    result = when (targetBase) {
                        "Binary" -> decimalToBinary(number)
                        "Octal" -> decimalToOctal(number)
                        "Hexadecimal" -> decimalToHexadecimal(number)
                        else -> number
                    }
                }
                "Hexadecimal" -> {
                    result = when (targetBase) {
                        "Binary" -> decimalToBinary(hexadecimalToDecimal(number))
                        "Octal" -> decimalToOctal(hexadecimalToDecimal(number))
                        "Decimal" -> hexadecimalToDecimal(number)
                        else -> number
                    }
                }
            }

            findViewById<TextView>(R.id.resultText).text = result
            Toast.makeText(this, "Converted from $sourceBase to $targetBase", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(
                this,
                "Invalid Input! for $sourceBase Base",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun checkInput(number: String, sourceBase: String): Boolean {
        if (sourceBase == "Binary") {
            for (i in 0..number.lastIndex) {
                if (!(number[i] == '0' || number[i] == '1'))
                    return false
            }
            return true
        } else if (sourceBase == "Octal") {
            for (i in 0..number.lastIndex) {
                if (!(number[i] == '0' || number[i] == '1' || number[i] == '2' || number[i] == '3' || number[i] == '4' || number[i] == '5' || number[i] == '6' || number[i] == '7'))
                    return false
            }
            return true
        } else if (sourceBase == "Decimal") {
            for (i in 0..number.lastIndex) {
                if (!(number[i] == '0' || number[i] == '1' || number[i] == '2' || number[i] == '3' || number[i] == '4' || number[i] == '5' || number[i] == '6' || number[i] == '7' || number[i] == '8' || number[i] == '9'))
                    return false
            }
            return true
        } else if (sourceBase == "Hexadecimal") {
            for (i in 0..number.lastIndex) {
                if (!(number[i] == '0' || number[i] == '1' || number[i] == '2' || number[i] == '3' || number[i] == '4' || number[i] == '5' || number[i] == '6' || number[i] == '7' ||
                            number[i] == '8' || number[i] == '9' || number[i] == 'A' || number[i] == 'B' || number[i] == 'C' || number[i] == 'D' || number[i] == 'E' || number[i] == 'F' ))
                    return false
            }
            return true
        }
        return false
    }

    private fun binaryToDecimal(number: String): String {
        var result = 0
        for (i in 0..number.lastIndex) {
            result += (number[number.lastIndex - i].toString().toInt() * 2.0.pow(i.toDouble())
                .toInt())
        }
        return result.toString()
    }

    private fun octalToDecimal(number: String): String {
        var result = 0
        for (i in 0..number.lastIndex) {
            result += (number[number.lastIndex - i].toString().toInt() * 8.0.pow(i.toDouble())
                .toInt())
        }
        return result.toString()
    }

    private fun hexadecimalToDecimal(number: String): String {
        var result = 0
        val hexArr = listOf('A', 'B', 'C', 'D', 'E', 'F')
        for (i in 0..number.lastIndex) {
            var num = 0
            if (number[number.lastIndex - i].isDigit())
                num = number[number.lastIndex - i].toString().toInt()
            else if (number[number.lastIndex - i].isLetter())
                num = 10 + hexArr.indexOf(number[number.lastIndex - i].uppercaseChar())
            result += (num.toString().toInt() * 16.0.pow(i.toDouble())).toInt()
        }
        return result.toString()
    }

    private fun decimalToBinary(number: String): String {
        var num: Int = number.toInt()
        var answer = ""
        do {
            val rem = num % 2
            answer += rem
            num /= 2
        } while (num >= 2)

        answer += num
        return answer.reversed()
    }

    private fun decimalToOctal(number: String): String {
        var num: Int = number.toInt()
        var answer = ""
        do {
            val rem = num % 8
            answer += rem
            num /= 8
        } while (num >= 8)

        answer += num
        return answer.reversed()
    }

    private fun decimalToHexadecimal(number: String): String {
        var num: Int = number.toInt()
        val hexArr = listOf('A', 'B', 'C', 'D', 'E', 'F')
        var answer = ""
        do {
            val rem = num % 16
            if (rem > 9)
                answer += hexArr[rem % 10]
            else
                answer += rem
            num /= 16
        } while (num >= 16)

        if (num > 9)
            answer += hexArr[num % 10]
        else
            answer += num
        return answer.reversed()
    }
}