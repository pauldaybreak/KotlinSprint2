package lesson_2

import kotlin.math.pow
import kotlin.time.times

fun main(){
    val resultInvest: Double // результат вклада
    val startSum: Double = 700000.000
    val percentTax: Double = 16.7
    val countOfPeriod = 20
    var rate: Double = 1.0 // степень
    val percent: Double = percentTax/100 // привести проценты для матем. операций

    for(i in 1..countOfPeriod) {
        rate *= (1 + percent)
    }
    resultInvest = (startSum*rate)/10
    println(String.format("%.3f", resultInvest))
}

