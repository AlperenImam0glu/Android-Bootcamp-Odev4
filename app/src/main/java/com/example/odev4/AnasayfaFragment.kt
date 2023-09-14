package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import com.example.odev4.databinding.ActivityMainBinding
import com.example.odev4.databinding.FragmentAnasayfBinding
import com.google.android.material.snackbar.Snackbar

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfBinding.inflate(layoutInflater, container, false)

        binding.buttonNavToA.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.actionAnasayfaFragmentToSayfaAFragment()
            findNavController().navigate(gecis)
        }
        binding.buttonNavToX.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.actionAnasayfaFragmentToSayfaXFragment()
            findNavController().navigate(gecis)
        }

        return binding.root
    }


}