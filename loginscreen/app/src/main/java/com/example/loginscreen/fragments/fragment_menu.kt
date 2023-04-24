package com.example.loginscreen.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.loginscreen.MainActivity
import com.example.loginscreen.R
import com.example.loginscreen.viewModels.MainActivityViewModel

class FragmentMenu : Fragment() {
    lateinit var viewModel: MainActivityViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainActivityViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnLog=view.findViewById<TextView>(R.id.tvLogin)
        val btnSign=view.findViewById<TextView>(R.id.tvSign)


        btnLog.setOnClickListener(){

            val homeFragment = activity?.supportFragmentManager?.findFragmentByTag("fragment_menu")
            if (homeFragment != null) {
                val transaction = activity?.supportFragmentManager?.beginTransaction()
                transaction?.remove(homeFragment)?.commit()
            }
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.flMenu, FragmentLogin(), "fragment_login")?.commit()
            //getView().visibility(View.GONE)
            //transaction.hide(fragment_menu)

        }

        btnSign.setOnClickListener(){
            val homeFragment = activity?.supportFragmentManager?.findFragmentByTag("fragment_menu")
            if (homeFragment != null) {
                val transaction = activity?.supportFragmentManager?.beginTransaction()
                transaction?.remove(homeFragment)?.commit()
            }
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.flMenu, FragmentSign(), "fragment_sign")?.commit()

        }


    }
}