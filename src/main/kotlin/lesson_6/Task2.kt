package lesson_6

fun main() {
    println("Задайте время для таймера")
    val countSecondsForTimer = readln().toInt() // количество секунд для таймера
    var i = 1  // начало таймера
    println("На какой секунде встать на паузу.")
    val pausedTimer = readln().toInt()  // с какой секунды встать на паузу
    do {
        Thread.sleep(1000)
        println("Прошло ${i++} секунд")
        if (i == pausedTimer) {
            println("Таймер на паузе на $i секунде, для продолжения нажмите S и Enter")
            val onResumeTimer = readln() // продолжить таймер
            if (onResumeTimer == "S") {
                println("Таймер возобновлён")
                continue
            }
        }
    } while (i <= countSecondsForTimer)
}



