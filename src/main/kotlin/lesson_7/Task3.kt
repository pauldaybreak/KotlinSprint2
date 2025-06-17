package lesson_7

import kotlin.text.StringBuilder

fun main() {
    println("Введите число: ")
    val userInputNumber = readln().toInt()
    val progressiveNum = StringBuilder()
    for (i in 0..userInputNumber step 2) {
        progressiveNum.append(i)
    }
    progressiveNum.toString()
    print(progressiveNum)
}