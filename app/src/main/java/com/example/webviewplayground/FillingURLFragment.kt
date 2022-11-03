package com.example.webviewplayground

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.webviewplayground.databinding.FragmentFillingUrlBinding

class FillingURLFragment : Fragment() {

    private var _binding: FragmentFillingUrlBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFillingUrlBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonWebView.setOnClickListener {
            FillingURLFragmentDirections.actionFillingURLFragmentToWebViewFragment("https://www.google.com/")
            findNavController().navigate(R.id.action_fillingURLFragment_to_webViewFragment)
        }

    }


}