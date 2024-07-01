package ru.itis.summerpractice24.hm1

class FamilyAuto(
    brand: String,
    model: String,
    year: Int,
    horsepower: Int,
    color: String,
    private val trunk: Int,
) : Auto(
    brand = brand,
    model = model,
    year = year,
    horsepower = horsepower,
    color = color
) {
    override fun toString(): String {
        return super.toString() + "\n--- Trunk: $trunk"
    }
}