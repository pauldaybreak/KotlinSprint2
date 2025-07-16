package lesson_12

import lesson_12.Task5.Companion.COUNT_OF_DAY
import lesson_12.Task5.Companion.KELVIN_TO_CELSIUM
import kotlin.random.Random

class Task5(
    var dayTemp: Int,
    var nightTemp: Int,
    var isRainy: Boolean,
) {
    companion object {
        const val KELVIN_TO_CELSIUM = -273
        const val COUNT_OF_DAY = 30
    }
}

fun main() {
    val listOfTemperature = mutableListOf<Task5>()

    for (i in 1 until COUNT_OF_DAY) {
        val temperatureOfDay = Task5(generateTemperature(), generateTemperature(), generateRainy())
        listOfTemperature.add(temperatureOfDay)
    }

    val middleDayTemperature = ((listOfTemperature.map { it.dayTemp + KELVIN_TO_CELSIUM }).sum()) / COUNT_OF_DAY
    val middleNightTemperature = ((listOfTemperature.map { it.nightTemp + KELVIN_TO_CELSIUM }).sum()) / COUNT_OF_DAY
    val countDaysRainy = listOfTemperature.count { it.isRainy }
    println(
        """
                Средняя температура в Цельсиях:
                Днём: $middleDayTemperature, 
                Ночью: $middleNightTemperature,
                Дней с осадками $countDaysRainy
        """.trimIndent()
    )
}

fun generateTemperature(): Int {
    return Random.nextInt(100, 500)
}

fun generateRainy(): Boolean {
    return Random.nextBoolean()

}

