package lesson_12

const val KELVIN_TEMPERATURE = -273

class Task3(
    dayTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    isRainy: Boolean
) {
    var dayTemperatureKelvin = dayTemperatureKelvin
    var nightTemperatureKelvin = nightTemperatureKelvin
    var isRainy = isRainy

    fun printInfo() {
        println("Температура в Цельсиях:\nДнем: ${dayTemperatureKelvin + KELVIN_TEMPERATURE},\nНочью: ${nightTemperatureKelvin + KELVIN_TEMPERATURE},\nОсадки: $isRainy")
    }
}

fun main() {
    val weather160725 = Task3(303, 250, true)
    weather160725.printInfo()
}