package lesson_1_10.lesson_7

// Генерация случайного пароля

fun main() {
    val alphaRange = "abcdefghiklmnopqrstuvwxyz"
    val numRange = 0..9
    for (z in 1..3) {
        print(alphaRange.random())
        print(numRange.random())
    }
}