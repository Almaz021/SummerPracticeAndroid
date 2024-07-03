package ru.itis.summerpractice24.hm2

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import ru.itis.summerpractice24.R
import ru.itis.summerpractice24.databinding.ItemCarBinding

class CarHolder(
    private val binding: ItemCarBinding,
    private val glide: RequestManager,
    private val onClick: (Car) -> Unit,
) : ViewHolder(binding.root) {

    fun onBind(car: Car) {
        binding.run {
            tvCar.text = car.name
            tvInfo.text = car.price

            glide
                .load(car.url)
                .error(R.drawable.baseline_settings_24)
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(ivImage)

            root.setOnClickListener {
                onClick.invoke(car)
            }
        }
    }

}