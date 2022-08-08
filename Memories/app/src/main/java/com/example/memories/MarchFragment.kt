package com.example.memories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.memories.databinding.FragmentMarchBinding

class MarchFragment : Fragment() {
    private var _binding: FragmentMarchBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentMarchBinding.inflate(inflater, container, false)

        binding.january.setOnClickListener {
            findNavController().navigate(R.id.action_marchFragment_to_januaryFragment)
        }

        binding.february.setOnClickListener {
            findNavController().navigate(R.id.action_marchFragment_to_februaryFragment)
        }

        binding.april.setOnClickListener {
            findNavController().navigate(R.id.action_marchFragment_to_aprilFragment)
        }

        binding.may.setOnClickListener {
            findNavController().navigate(R.id.action_marchFragment_to_mayFragment)
        }

        binding.june.setOnClickListener {
            findNavController().navigate(R.id.action_marchFragment_to_juneFragment)
        }

        binding.july.setOnClickListener {
            findNavController().navigate(R.id.action_marchFragment_to_julyFragment)
        }


        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}