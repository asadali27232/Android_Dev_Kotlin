package com.example.tiptime

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.example.tiptime.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener { calculateTip() }

        binding.roundUpSwitch.setOnClickListener { calculateTip() }

        binding.option20.setOnClickListener { calculateTip() }
        binding.option18.setOnClickListener { calculateTip() }
        binding.option15.setOnClickListener { calculateTip() }

    }

    private fun calculateTip() {
        val costString = binding.costOfService.text.toString()
        if (costString != "") {
            val cost = costString.toDouble()

            val tipPercentage = when (binding.tipOption.checkedRadioButtonId) {
                R.id.option20 -> 0.20
                R.id.option18 -> 0.18
                else -> 0.15
            }

            var tip = tipPercentage * cost

            val roundUp = binding.roundUpSwitch.isChecked
            if (roundUp)
                tip = kotlin.math.ceil(tip)

            displayTip(tip)

        } else {
            Toast.makeText(this, "Please Enter Cost of Service!", Toast.LENGTH_SHORT).show()
            binding.tipResult.text = ""
        }
    }

    private fun displayTip(tip: Double) {
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }
}



