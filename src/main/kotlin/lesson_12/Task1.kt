package lesson_12

class Task1(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var isRainy: Boolean,
) {
    fun printInfo() {
        println("dayTemp: $dayTemperature, nightTemp: $nightTemperature, isRainy: $isRainy")
    }
}

fun main() {
    val weather140725 = Task1(30, 25, true)
    weather140725.printInfo()

    val weather010125 = Task1(
        -20, -30, false
    )
    weather140725.dayTemperature = 32
    weather140725.nightTemperature = 24
    weather140725.isRainy = false

    weather010125.dayTemperature = -20
    weather010125.nightTemperature = -33
    weather010125.isRainy = false

    weather140725.printInfo()
    weather010125.printInfo()
}

