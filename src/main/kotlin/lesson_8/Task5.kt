package lesson_8

// Массив из ингредиентов

fun main() {
    println("Введите количество ингридиентов")
    val countOfIngridient = readln().toInt() // ввод количества элементов массива с продуктами
    var masOfIngridietns: Array<String?> = arrayOfNulls(countOfIngridient) // создание массива размером введёным ранее
    var index = 0
    println("введите $countOfIngridient продукта(ов)")
    do {
        println("введите продукт: ")
        val userInput = readln().toString().trim()
        if (userInput in masOfIngridietns) {  // проверка, что б не повторялись продукты
            println("вы уже вводили этот продукт")
            continue
        } else {
            masOfIngridietns.set(index, userInput)
            index++
        }
    } while (index < countOfIngridient)

    println("введённые продукты: ${masOfIngridietns.joinToString()}")

}