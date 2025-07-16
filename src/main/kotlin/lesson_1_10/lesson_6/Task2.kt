package lesson_1_10.lesson_6

fun main() {
    println("Задайте время для таймера")
    val countSecondsForTimer = readln().toInt() // количество секунд для таймера
    Thread.sleep(countSecondsForTimer * 1000L)
    println("Прошло $countSecondsForTimer секунд")
    }




