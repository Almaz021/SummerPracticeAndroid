package ru.itis.summerpractice24.hm2

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import ru.itis.summerpractice24.R
import ru.itis.summerpractice24.databinding.FragmentStoreBinding

class StoreFragment : Fragment(R.layout.fragment_store) {

    private var binding: FragmentStoreBinding? = null

    private var adapter: CarAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentStoreBinding.bind(view)

        initAdapter()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    @SuppressLint("SuspiciousIndentation")
    private fun initAdapter() {

        binding?.run {
            adapter = CarAdapter(
                list = CarRepository.cars,
                glide = Glide.with(this@StoreFragment),
                onClick = {
                    val id = it.id
                    findNavController().navigate(
                        resId = R.id.action_storeFragment_to_descriptionFragment,
                        args = DescriptionFragment.bundle(
                            id = id
                        )
                    )
                })
            rvCar.adapter = adapter
            rvCar.layoutManager = LinearLayoutManager(requireContext())
        }
    }
}