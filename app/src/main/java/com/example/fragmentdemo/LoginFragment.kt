package com.example.fragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val btnLogin:Button = view.findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_aboutFragment)
        }

        return view
    }

}