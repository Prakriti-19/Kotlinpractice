package com.example.desertpusher

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Title : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val binding: FragmentTitleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_title, container, false)
        binding.Button.setOnClickListener { v: View ->
            v.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToGameFragment())
        }
    }
}
