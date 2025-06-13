package lesson_6

fun main() {
    var countSecondsForTimer = readln().toInt()
    while (countSecondsForTimer > 0) {
        Thread.sleep(1000)
        println("Осталось секунд: ${countSecondsForTimer--}")
    }
    println("Время вышло")

}