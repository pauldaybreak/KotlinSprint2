package lesson_1_10.lesson_2

import kotlin.math.pow

fun main() {

    val startSum: Double = 700000.000
    val percentTax: Double = 16.7
    val countOfPeriod = 20
    val percent: Double = percentTax / 100 // привести проценты для матем. операций

    val resultInvest = startSum * (1 + percent).pow(countOfPeriod) / 10 // результат вклада
    println(String.format("%.3f", resultInvest))
}

