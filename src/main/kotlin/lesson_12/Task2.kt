package lesson_12

class Task2(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var isRainy: Boolean,
) {
    fun printInfo() {
        println("Температура днем: $dayTemperature, Температура ночью: $nightTemperature, Осадки: $isRainy")
    }
}

fun main() {
    val weather160725 = Task2(30, 25, true)
    weather160725.printInfo()
}