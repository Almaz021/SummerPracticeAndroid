package ru.itis.summerpractice24.hm2

import android.annotation.SuppressLint
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import ru.itis.summerpractice24.R
import ru.itis.summerpractice24.databinding.FragmentDescriptionBinding
import java.net.URL


class DescriptionFragment : Fragment(R.layout.fragment_description) {
    private var binding: FragmentDescriptionBinding? = null
    private lateinit var car: Car


    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDescriptionBinding.bind(view)

        val message = arguments?.getInt(ARG_MSG) ?: 0
        val list = CarRepository.cars
        for (i in list) {
            if (i.id == message) {
                car = i
            }
        }

        binding?.run {
            Glide.with(this@DescriptionFragment)
                .load(car.secondUrl)
                .into(ivCar);
            tvName.text = car.name
            tvPrice.text = car.price
            tvSpeed.text = car.zeroToHundred
            tvDesc.text = car.description
            tvMax.text = car.topSpeed

            button2.setOnClickListener{
                findNavController().navigate(
                    resId = R.id.storeFragment
                )
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        private const val ARG_MSG = "ARG_EMAIL"

        fun bundle(id: Int): Bundle = Bundle().apply {

            putInt(ARG_MSG, id)
        }
    }
}