package lesson_12

class Task1(){
    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var isRainy: Boolean = false

    fun printInfo() {
        println("dayTemp: $dayTemperature, nightTemp: $nightTemperature, isRainy: $isRainy")
    }
}

fun main() {
    val weather140725 = Task1()
    weather140725.dayTemperature = 20
    weather140725.nightTemperature = 20
    weather140725.isRainy = true


    val weather010125 = Task1()
    weather010125.dayTemperature = 10
    weather010125.nightTemperature = 15
    weather010125.isRainy = false

    weather140725.dayTemperature = 32
    weather140725.nightTemperature = 24
    weather140725.isRainy = false

    weather010125.dayTemperature = -20
    weather010125.nightTemperature = -33
    weather010125.isRainy = true

    weather140725.printInfo()
    weather010125.printInfo()
}

