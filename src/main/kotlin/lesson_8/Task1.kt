package lesson_8

import kotlin.random.Random

const val RANGE_OF_VIEWS = 9999
const val RANGE_OF_PERIOD = 7

fun main() {
    generationCountViews()
}

fun generationCountViews() {
    var countOfDays = 1
    var countViewAd = Array<Int>(RANGE_OF_PERIOD) { i -> Random.nextInt(RANGE_OF_VIEWS) }
    for (i in countViewAd) {
        println("Просмотров $i за $countOfDays день ")
        countOfDays++
    }
    sumViewsOfPeriod(countViewAd)
}

fun sumViewsOfPeriod(mas: Array<Int>) {
    var sum = 0
    for (i in mas) {
        sum += i
    }
    print("Сумма просмотров за $RANGE_OF_PERIOD дней: " + sum)
}
