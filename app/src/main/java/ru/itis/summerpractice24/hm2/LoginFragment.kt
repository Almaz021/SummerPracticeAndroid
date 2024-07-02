package ru.itis.summerpractice24.hm2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import ru.itis.summerpractice24.R
import ru.itis.summerpractice24.databinding.FragmentLoginBinding

class LoginFragment : Fragment(R.layout.fragment_login) {

    private var binding: FragmentLoginBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentLoginBinding.bind(view)

        binding?.run {
            button3.setOnClickListener {
                val text = etEmail.text.toString()
                if (text != "") {
                    findNavController().navigate(
                        resId = R.id.action_loginFragment_to_showFragment,/////////////
                        args = ShowFragment.bundle(
                            email = etEmail.text.toString()
                        )
                    )
                } else {
                    Snackbar.make(root, "Для отправки текста требуется заполнить поле", Snackbar.LENGTH_LONG).show()
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}