package lesson_7

import kotlin.concurrent.thread

// Таймер с циклом for

fun main() {
    val countSecondsForTimer = readln().toInt() // ввод кол-ва секунд от пользователя
    for (i in countSecondsForTimer downTo 0) {
        Thread.sleep(1000)
        println("$i сек")
    }
    println("Время вышло")

}