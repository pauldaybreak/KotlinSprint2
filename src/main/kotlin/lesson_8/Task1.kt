package lesson_8

import kotlin.random.Random

// Симуляция просмотров рекламы и вычисление суммы

const val RANGE_OF_VIEWS = 9999 // Диапозон количества просмотров
const val RANGE_OF_PERIOD = 7 // Диапозон временного периода (неделя)

fun main() {
    generationCountViews()
}

//  Генерация количества просмотров
fun generationCountViews() {
    var countOfDays = 1
    var countViewAd = Array<Int>(RANGE_OF_PERIOD) { i -> Random.nextInt(RANGE_OF_VIEWS) }
    for (i in countViewAd) {
        println("Просмотров $i за $countOfDays день ")
        countOfDays++
    }
    sumViewsOfPeriod(countViewAd)
}

// Сумма просмотров за период
fun sumViewsOfPeriod(mas: Array<Int>) {
    var sum = 0
    for (i in mas) {
        sum += i
    }
    print("Сумма просмотров за $RANGE_OF_PERIOD дней: " + sum)
}
