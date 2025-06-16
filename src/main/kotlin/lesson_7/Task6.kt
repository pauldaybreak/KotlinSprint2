package lesson_7

fun main() {
    val numbers = intArrayOf(5, 12, -3, 8, 17, 9)
    var max = numbers[0]
    for (i in numbers) {
        if (max < i) {
            max = i
        }
    }
    println(max)
}