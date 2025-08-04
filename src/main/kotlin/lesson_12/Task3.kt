package lesson_12

class Task3(
    dayTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    isRainy: Boolean
) {
    var dayTemperatureKelvin = dayTemperatureKelvin + KELVIN_TEMPERATURE
    var nightTemperatureKelvin = nightTemperatureKelvin + KELVIN_TEMPERATURE
    var isRainy = isRainy

    fun printInfo() {
        println("Температура в Цельсиях:\nДнем: ${dayTemperatureKelvin},\nНочью: ${nightTemperatureKelvin},\nОсадки: $isRainy")
    }
    companion object{
        const val KELVIN_TEMPERATURE = -273
    }
}

fun main() {
    val weather160725 = Task3(303, 250, true)
    weather160725.printInfo()
}