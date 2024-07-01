package ru.itis.summerpractice24.hm1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import ru.itis.summerpractice24.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var viewBinding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding?.root)
        initViews()
    }

    private fun initViews() {
        viewBinding?.let { binding ->
            binding.button.setOnClickListener {
                main(binding.editTextText.text.toString().toInt())
            }
        }
    }

    private fun main(num: Int) {
        val generator = AutoGenerator()
        val racing = Race()
        val autos = ArrayList<Auto>()
        for (i in 1..num) {
            autos.add(generator.generate(i))
        }
        var counter = 1
        while (autos.size > 1) {
            println("--- Круг ${counter++}")
            val pairs = autos.shuffled().chunked(2)
            for (pair in pairs) {
                if (pair.size == 2) {
                    val winner = racing.race(pair[0], pair[1])
                    if (pair[0] == winner) {
                        autos.remove(pair[1])
                        println("--- Гонка между ${pair[0].getBrand()} и ${pair[1].getBrand()}. Выиграл ${pair[0].getBrand()}")
                    } else {
                        autos.remove(pair[0])
                        println("--- Гонка между ${pair[0].getBrand()} и ${pair[1].getBrand()}. Выиграл ${pair[1].getBrand()}")
                    }
                } else {
                    println("--- ${pair[0].getBrand()} - Нет пары, следующий круг")
                }
            }
        }
        println("--- Победитель - ${autos[0].getBrand()}")
        println("--- ${autos[0]}")
    }
}
