package ru.itis.summerpractice24.hm2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager
import ru.itis.summerpractice24.databinding.ItemCarBinding

class CarAdapter(
    private val list: List<Car>,
    private val glide: RequestManager,
    private val onClick: (Car) -> Unit,
) : RecyclerView.Adapter<CarHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CarHolder {
        return CarHolder(
            binding = ItemCarBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            glide = glide,
            onClick = onClick
        )
    }

    override fun onBindViewHolder(holder: CarHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}