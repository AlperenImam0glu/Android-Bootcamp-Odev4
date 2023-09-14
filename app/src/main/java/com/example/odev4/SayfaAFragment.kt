package com.example.odev4

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.odev4.databinding.FragmentSayfaABinding

class SayfaAFragment : Fragment() {


    private lateinit var binding: FragmentSayfaABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaABinding.inflate(layoutInflater, container, false)

        binding.buttonNavToB.setOnClickListener {
            val gecis = SayfaAFragmentDirections.actionSayfaAFragmentToSayfaBFragment()
            findNavController().navigate(gecis)
        }
        return binding.root
    }

}