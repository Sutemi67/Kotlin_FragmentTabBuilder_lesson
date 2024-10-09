package com.example.fragmenttabbuilder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmenttabbuilder.databinding.Fragment1Binding

class Fragment1 : Fragment() {
    //    private var param1: String? = null
//    private var param2: String? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        arguments?.let {
//            param1 = it.getString(ARG_PARAM1)
//            param2 = it.getString(ARG_PARAM2)
//        }
//    }
    private lateinit var binding: Fragment1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment1Binding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.number.text = requireArguments().getInt(NUMBER).toString()
    }

    companion object {
        private const val NUMBER = "number"

        @JvmStatic
        fun newInstance(number: Int) =
            Fragment1().apply {
                arguments = Bundle().apply {
                    putInt(NUMBER, number)
                }
            }
    }
}