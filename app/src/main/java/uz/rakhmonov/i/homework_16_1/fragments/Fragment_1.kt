package uz.rakhmonov.i.homework_16_1.fragments

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import uz.rakhmonov.i.homework_16_1.R
import uz.rakhmonov.i.homework_16_1.databinding.Fragment1Binding
import uz.rakhmonov.i.homework_16_1.utils.myData


class Fragment_1 : Fragment() {

    lateinit var binding: Fragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment1Binding.inflate(layoutInflater)

        binding.myContayner1.setBackgroundColor(Color.parseColor(myData.color))

        val fragment2 = Fragment_2()
        binding.editColor.setOnClickListener {
            val fragmentManager = parentFragmentManager
            fragmentManager.popBackStack()
            fragmentManager.beginTransaction()
                .replace(R.id.my_contayner, fragment2)
                .addToBackStack("hkkjk")
                .commit()
        }
        return binding.root

    }








}