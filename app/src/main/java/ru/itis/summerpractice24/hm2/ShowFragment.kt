package ru.itis.summerpractice24.hm2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.itis.summerpractice24.R
import ru.itis.summerpractice24.databinding.FragmentShowBinding

class ShowFragment : Fragment(R.layout.fragment_show) {

    private var binding: FragmentShowBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentShowBinding.bind(view)

        val message = arguments?.getString(ARG_MSG) ?: "ERROR"

        binding?.run {
            textView2.text = message
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {

        const val ARG_MSG = "ARG_EMAIL"

        fun bundle(email: String): Bundle = Bundle().apply {

            putString(ARG_MSG, email)
        }
    }
}