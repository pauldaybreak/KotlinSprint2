package lesson_12

const val KELVIN_TEMPERATURE = -273

class Task4(
    dayTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    isRainy: Boolean
) {

    init {
        println(
            """
            Температура в Цельсиях: 
            Днем:${dayTemperatureKelvin + KELVIN_TEMPERATURE}, 
            Ночью:${nightTemperatureKelvin + KELVIN_TEMPERATURE}, 
            Осадки: $isRainy
           """.trimIndent()
        )
    }
}

fun main() {
    val weather160725 = Task4(303, 250, true)

}
