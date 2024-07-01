package ru.itis.summerpractice24.hm1

class Race {
    fun race(auto1: Auto, auto2: Auto): Auto {
        return if (auto1.getBrand() == auto2.getBrand()) {
            if (auto1.getYear() > auto2.getYear()) {
                auto1
            } else {
                auto2
            }
        } else {
            if (auto1.getHorsepower() > auto2.getHorsepower()) {
                auto1
            } else {
                auto2
            }
        }
    }
}