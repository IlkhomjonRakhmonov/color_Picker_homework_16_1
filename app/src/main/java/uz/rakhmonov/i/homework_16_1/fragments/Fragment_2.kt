package uz.rakhmonov.i.homework_16_1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.rakhmonov.i.homework_16_1.R
import uz.rakhmonov.i.homework_16_1.databinding.Fragment2Binding
import uz.rakhmonov.i.homework_16_1.utils.myData

class Fragment_2 : Fragment() {

lateinit var binding: Fragment2Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= Fragment2Binding.inflate(layoutInflater)
        val fragment1=Fragment_1()
        val fragmentManager=parentFragmentManager

        binding.apply {
            rectangle1.setOnClickListener {
                myData.color = "#EF3B3B"

            }

            rectangle2.setOnClickListener {
                myData.color="#F1D206"
            }

            rectangle3.setOnClickListener {
                myData.color="#78DA2B"
            }
            rectangle4.setOnClickListener {
                myData.color="#5DE4CC"
            }
            rectangle5.setOnClickListener {
                myData.color="#2C7DB8"
            }
            rectangle6.setOnClickListener {
                myData.color="#4B35CE"
            }
            rectangle7.setOnClickListener {
                myData.color="#BF5FE0"
            }
            rectangle8.setOnClickListener {
                myData.color="#D53294"
            }
            rectangle9.setOnClickListener {
                myData.color="#864343"
            }
            rectangle10.setOnClickListener {
                myData.color="#BFA050"
            }
            rectangle11.setOnClickListener {
                myData.color="#351A63"
            }
            rectangle12.setOnClickListener {
                myData.color="#781189"
            }
        }
        binding.setColor.setOnClickListener {
            fragmentManager.popBackStack()
            fragmentManager.beginTransaction().replace(R.id.my_contayner,fragment1)
                .commit()

        }
return binding.root   }

}