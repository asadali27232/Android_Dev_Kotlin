package com.example.memories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.memories.databinding.FragmentJanuaryBinding

class JanuaryFragment : Fragment() {
    private  var _binding: FragmentJanuaryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentJanuaryBinding.inflate(inflater, container, false)

        binding.february.setOnClickListener {
            findNavController().navigate(R.id.action_januaryFragment_to_februaryFragment)
        }

        binding.march.setOnClickListener {
            findNavController().navigate(R.id.action_januaryFragment_to_marchFragment)
        }

        binding.april.setOnClickListener {
            findNavController().navigate(R.id.action_januaryFragment_to_aprilFragment)
        }

        binding.may.setOnClickListener {
            findNavController().navigate(R.id.action_januaryFragment_to_mayFragment)
        }

        binding.june.setOnClickListener {
            findNavController().navigate(R.id.action_januaryFragment_to_juneFragment)
        }

        binding.july.setOnClickListener {
            findNavController().navigate(R.id.action_januaryFragment_to_julyFragment)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}