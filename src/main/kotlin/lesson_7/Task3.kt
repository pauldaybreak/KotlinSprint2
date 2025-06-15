package lesson_7


import kotlin.text.StringBuilder

// Вывод чётных чисел в консоль

fun main() {
    val userInputNumber = readln().toInt() // Пользовательский ввод
    val progressiveNum = StringBuilder() // Полученное число
    for (i in 0..userInputNumber step 2) { // Цикл с прогрессией
        progressiveNum.append(i)

    }
    progressiveNum.toString().toDouble() // Преобразую в Double, т.к. число и может быть очень большим
    print(progressiveNum)
}