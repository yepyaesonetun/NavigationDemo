package com.padcmyanmar.padcx.navigationdemo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        if (view != null) {
            init(view)
        }

        return view
    }

    private fun init(view: View?) {
        view?.findViewById<Button>(R.id.btnNews)?.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.newsFragment)
        }

        view?.findViewById<Button>(R.id.btnProfile)?.setOnClickListener {
            val bundle = bundleOf("userName" to "Ko Ye")
            Navigation.findNavController(view).navigate(R.id.profileFragment, bundle)
        }
    }


}
