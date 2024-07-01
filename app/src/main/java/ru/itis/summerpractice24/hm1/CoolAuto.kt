package ru.itis.summerpractice24.hm1

class CoolAuto(
    brand: String,
    model: String,
    year: Int,
    horsepower: Int,
    color: String,
    private val driveUnit: String,
) : Auto(
    brand = brand,
    model = model,
    year = year,
    horsepower = horsepower,
    color = color
) {
    override fun toString(): String {
        return super.toString() + "\n--- Drive Unit: $driveUnit"
    }
}