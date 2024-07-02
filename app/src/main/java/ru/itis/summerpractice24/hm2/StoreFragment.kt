package ru.itis.summerpractice24.hm2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.itis.summerpractice24.R
import ru.itis.summerpractice24.databinding.FragmentStoreBinding

class StoreFragment : Fragment(R.layout.fragment_store) {

    private var binding: FragmentStoreBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentStoreBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}