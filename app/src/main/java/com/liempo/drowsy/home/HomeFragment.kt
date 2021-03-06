package com.liempo.drowsy.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

import com.liempo.drowsy.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(
        R.layout.fragment_home,
        container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        camera_card.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.openCamera())
        }

        gallery_card.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.openGallery())
        }

        settings_card.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.openSettings()
            )
        }

        about_card.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.openAbout()
            )
        }
    }

}
