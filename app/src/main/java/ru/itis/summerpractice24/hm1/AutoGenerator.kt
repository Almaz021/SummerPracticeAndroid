package ru.itis.summerpractice24.hm1

import kotlin.random.Random

class AutoGenerator {
    fun generate(i: Int): Auto {
        val brands = listOf("Lada", "Toyota", "Hyundai", "BMW", "Tesla")
        val models = listOf("1", "2", "3", "4", "5")
        val colors = listOf("White", "Black", "Pink", "Red", "Orange")
        val driveUnits = listOf("Back", "Forward", "Full")
        val type = Random.nextInt(1, 5);
        val brand = brands[Random.nextInt(5)]
        val model = models[Random.nextInt(5)]
        val color = colors[Random.nextInt(5)]
        val year = Random.nextInt(1940, 2025)
        val horsepower = Random.nextInt(50, 1001)
        if (type == 1) {
            return FamilyAuto(brand + i, model, year, horsepower, color, Random.nextInt(100, 500))
        } else if (type == 2) {
            return SportAuto(brand + i, model, year, horsepower, color, Random.nextInt(1, 6))
        } else if (type == 3) {
            return CoolAuto(brand + i, model, year, horsepower, color, driveUnits[Random.nextInt(3)])
        } else {
            return SuperAuto(brand + i, model, year, horsepower, color, Random.nextInt(100000, 1000000))
        }
    }
}