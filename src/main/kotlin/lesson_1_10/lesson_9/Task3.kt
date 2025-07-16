package lesson_1_10.lesson_9

fun main() {
    val ingredientsOnePart = mutableMapOf(
        2 to "яйцо шт.",
        100 to "молоко мл.",
        15 to "масло гр."
    )
    println("Введите количество порций: ")
    val count: Int = readln().toInt()

    println("На $count порции, нужно:")
    print(ingredientsOnePart.map {(key, value) -> key * count to value})

}