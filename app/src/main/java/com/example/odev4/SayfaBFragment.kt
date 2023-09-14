package com.example.odev4

import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.odev4.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {

    private lateinit var binding: FragmentSayfaBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaBBinding.inflate(layoutInflater, container, false)

        binding.buttonNavToY.setOnClickListener {
            val gecis = SayfaBFragmentDirections.actionSayfaBFragmentToSayfaYFragment()
            findNavController().navigate(gecis)
        }
        return binding.root
    }


}