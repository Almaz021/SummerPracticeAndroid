package ru.itis.summerpractice24.hm1

open class Auto(
    private val brand: String,
    private val model: String,
    private val year: Int,
    private val horsepower: Int,
    private val color: String,
) {
    override fun toString(): String {
        return "AUTO: Brand: $brand\n--- Model: $model\n--- Year: $year\n--- Horsepower: $horsepower\n--- Color: $color"
    }

    fun getBrand(): String = brand
    fun getYear(): Int = year
    fun getHorsepower(): Int = horsepower
}