package lesson_1_10.lesson_9

const val POSITIVE = "ДА"
const val NEGATIVE = "НЕТ"


fun main() {
    var baseIngridients = mutableListOf<String>("курица", "картошка", "лук")
    println("В рецепте есть базовые ингредиенты $baseIngridients")
    println("Желаете добавить еще? введите да ИЛИ нет")
    var userInput = readln().toString().trim()
    while (userInput.equals(POSITIVE, ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить? для выхода наберите: нет")
        var userInputIngridients = readln().toString().trim()
        if (userInputIngridients.equals(NEGATIVE, ignoreCase = true)) break
        if (baseIngridients.contains(userInputIngridients)) {
            println("такой продукт есть в списке")
        } else {
            baseIngridients.add(userInputIngridients)
        }
    }
    println("Теперь в рецепте есть следующие ингредиенты ${baseIngridients.joinToString()}")
}
