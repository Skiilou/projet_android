package com.example.loginscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.loginscreen.factory.MainActivityViewModelFactory
import com.example.loginscreen.fragments.FragmentMenu
import com.example.loginscreen.viewModels.MainActivityViewModel

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainActivityViewModel
    lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModelFactory = MainActivityViewModelFactory()
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)
       // val btnTest=findViewById<Button>(R.id.btnTest)



        //Affichage du premier fragment
        val fragTransaction = supportFragmentManager.beginTransaction()
        fragTransaction.replace(R.id.flMain, FragmentMenu(), "fragment_login").commit()



/*
        btnTest.setOnClickListener(){

            val fragment1 = supportFragmentManager.findFragmentByTag("fragment_login")

            val fragTransaction = supportFragmentManager.beginTransaction()
            fragTransaction.replace(R.id.flMain, FragmentLogin(), "fragment_login").commit()
        }


*/


        /*
         binding.btnEdit.setOnClickListener {
            val homeFragment = supportFragmentManager.findFragmentByTag("home")
            if (homeFragment != null) {
                val transaction = supportFragmentManager.beginTransaction()
                transaction.remove(homeFragment).commit()
            }
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout, EditFragment(), "edit").commit()
        }
         */

    }
}