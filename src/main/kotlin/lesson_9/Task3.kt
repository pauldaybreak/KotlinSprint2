package lesson_9

fun main() {
    val ingredientsOnePart = mutableMapOf(
        2 to "яйцо шт.",
        100 to "молоко мл.",
        15 to "масло гр."
    )
    println("Введите количество порций: ")
    val count = readln().toInt()
    val updateRecipe = mutableMapOf<Int, String>()

    for((key, value ) in ingredientsOnePart){
        val newKey = key*count
        updateRecipe.set(newKey, value)
    }
    println("На $count порции, нужно:")
    for((key, value ) in ingredientsOnePart){
        println("$value - $key")
    }
}