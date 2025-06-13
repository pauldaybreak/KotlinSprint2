package lesson_6

import kotlin.random.Random

fun main() {
    println("Игра: загадай число")
    val trueNumber = Random.nextInt(10) // число которое нужно отгадать
    var countTryGuess = 5 // количество попыток
    while (countTryGuess > 0) {
        val guessUserNumber = readln().toInt() // число игрока
        if (trueNumber == guessUserNumber) {
            println("Это была великолепная игра!")
            break
        } else
            println("Ты не угадал, осталось ${--countTryGuess} попыток")
    }
    println("Было загадано число $trueNumber")

}