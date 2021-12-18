package ru.anasoft.kotlin_1_1

data class Weather(val city: String, val temperature: Int) {
    override fun toString(): String {
        return "В городе $city температура: $temperature"
    }
}