package lesson_8

//  Поиск ингридиента в блюде

fun main() {
    val recipeOfSalad =
        arrayOf("морковь", "грибы", "картошка", "свекла", "соль", "перец", "курица") // массив из названий продуктов

    println("Введите ингредиент для блюда")
    val userQuery = readln().toString().trim() // пользовательский ввод
    var found = false // флаг найден/ не найден
    for (i in recipeOfSalad) {
        if (i == userQuery)
            found = true
    }
    if (found) {
        println("Ингридиент $userQuery есть в рецепте")
    } else {
        println("Такого ингридиента нет в рецепте")
    }
}
