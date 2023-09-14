package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.odev4.databinding.FragmentSayfaXBinding


class SayfaXFragment : Fragment() {

    private lateinit var binding: FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaXBinding.inflate(layoutInflater, container, false)

        binding.buttonNavToY.setOnClickListener {
            val gecis = SayfaXFragmentDirections.actionSayfaXFragmentToSayfaYFragment()
            findNavController().navigate(gecis)

        }
        return binding.root
    }


}