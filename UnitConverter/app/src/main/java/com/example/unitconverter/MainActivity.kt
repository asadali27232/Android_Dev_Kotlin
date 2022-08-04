package com.example.unitconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.example.unitconverter.converter.Angle
import com.example.unitconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val conversionTypeArray = resources.getStringArray(R.array.conversionTypesArray)
        val conversionTypeAdapter = ArrayAdapter(this, R.layout.dropdown_menu, conversionTypeArray)
        binding.conversionTypeInput.setAdapter(conversionTypeAdapter)

        binding.conversionTypeInput.setOnDismissListener {
            dropDown()
        }

        binding.convert.setOnClickListener() {
            convert()
        }

        binding.input.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                convert()
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })
    }

    private fun convert() {
        val conversionType = binding.conversionTypeInput.text.toString()
        val source = binding.sourceInput.text.toString()
        val target = binding.targetOutput.text.toString()
        val input = if (binding.input.text.toString() != "") binding.input.text.toString().toDouble() else 0.0

        Toast.makeText(this, "$source $target $input", Toast.LENGTH_SHORT).show()

        var result: Double = when (conversionType) {
            "Angle" -> Angle(source, target, input).convert()
            else -> 0.0
        }
        val resultRounded = "%.6f".format(result)
        binding.output.setText(resultRounded)
    }

    private fun dropDown() {
        //Getting reference to the array created in strings.xml
        val resetArray = listOf("")
        val angleArray = resources.getStringArray(R.array.angleArray)
        val digitalStorageArray = resources.getStringArray(R.array.digitalStorageArray)
        val lengthArray = resources.getStringArray(R.array.lengthArray)
        val massArray = resources.getStringArray(R.array.massArray)
        val speedArray = resources.getStringArray(R.array.speedArray)
        val temperatureArray = resources.getStringArray(R.array.temperatureArray)
        val timeArray = resources.getStringArray(R.array.timeArray)

        //Creating Array Adapters
        val resetAdapter = ArrayAdapter(this, R.layout.dropdown_menu, resetArray)
        val angleAdapter = ArrayAdapter(this, R.layout.dropdown_menu, angleArray)
        val digitalStorageAdapter = ArrayAdapter(this, R.layout.dropdown_menu, digitalStorageArray)
        val lengthAdapter = ArrayAdapter(this, R.layout.dropdown_menu, lengthArray)
        val massAdapter = ArrayAdapter(this, R.layout.dropdown_menu, massArray)
        val speedAdapter = ArrayAdapter(this, R.layout.dropdown_menu, speedArray)
        val temperatureAdapter = ArrayAdapter(this, R.layout.dropdown_menu, temperatureArray)
        val timeAdapter = ArrayAdapter(this, R.layout.dropdown_menu, timeArray)

        with(binding) {
            if (conversionTypeInput.text.toString() == "Angle") {
                sourceInput.setAdapter(angleAdapter)
                targetOutput.setAdapter(angleAdapter)
            } else if (conversionTypeInput.text.toString() == "Digital Storage") {
                sourceInput.setAdapter(digitalStorageAdapter)
                targetOutput.setAdapter(digitalStorageAdapter)
            } else if (conversionTypeInput.text.toString() == "Length") {
                sourceInput.setAdapter(lengthAdapter)
                targetOutput.setAdapter(lengthAdapter)
            } else if (conversionTypeInput.text.toString() == "Mass") {
                sourceInput.setAdapter(massAdapter)
                targetOutput.setAdapter(massAdapter)
            } else if (conversionTypeInput.text.toString() == "Speed") {
                sourceInput.setAdapter(speedAdapter)
                targetOutput.setAdapter(speedAdapter)
            } else if (conversionTypeInput.text.toString() == "Temperature") {
                sourceInput.setAdapter(temperatureAdapter)
                targetOutput.setAdapter(temperatureAdapter)
            } else if (conversionTypeInput.text.toString() == "Time") {
                sourceInput.setAdapter(timeAdapter)
                targetOutput.setAdapter(timeAdapter)
            }

        }

    }
}