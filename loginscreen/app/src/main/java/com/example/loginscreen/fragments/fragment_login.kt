package com.example.loginscreen.fragments

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.example.loginscreen.R

class FragmentLogin : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }



    @RequiresApi(Build.VERSION_CODES.R)
    private fun hide(view: View) {
        view.animate()
            .translationY(activity?.windowManager?.currentWindowMetrics?.bounds?.height()?.toFloat()
                ?: 1000f)
            .alpha(0f)
            .setDuration(200)
            .setListener(object : AnimatorListenerAdapter() {
                override fun onAnimationEnd(animation: Animator) {
                    view.visibility = View.GONE
                }
            })
    }

    @RequiresApi(Build.VERSION_CODES.R)
    private fun show(view: View) {
        view.alpha = 0f
        view.y = activity?.windowManager?.currentWindowMetrics?.bounds?.height()?.toFloat() ?: 1000f
        view.visibility = View.VISIBLE
        view.animate()
            .translationY(0f)
            .alpha(1f)
            .setDuration(200)
            .setListener(null)
    }

}