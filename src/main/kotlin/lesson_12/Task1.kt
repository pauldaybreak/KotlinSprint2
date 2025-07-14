package lesson_12

class Task1(

    var dayTemperature: Int = 0,
    var nightTemperature: Int = -1,
    var isRainy: Boolean = false,
) {
    fun printInfo(){
        println("dayTemp: $dayTemperature, nightTemp: $nightTemperature, isRainy: $isRainy")
    }

}

fun main() {
    val weather140725 = Task1(
        30,
        25,
        true
    )
    weather140725.printInfo()

    val weather010125 = Task1(
        -20,
        -30,
        false

    )
    weather140725.dayTemperature = 28
    weather140725.nightTemperature = 26

    weather010125.dayTemperature = -14
    weather010125.isRainy = false


}