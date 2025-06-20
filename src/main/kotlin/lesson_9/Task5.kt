package lesson_9

fun main() {
    print("Введите 5 неповторяющихся продуктов:")
    val ingredients = MutableList(5) { readln().trim() }.toSet().sorted()
    printInformation(ingredients as MutableList<String>)
}

fun printInformation(list: MutableList<String>) {
    list[0] = list[0].replaceFirstChar { it.uppercase() }
    print(list.joinToString())
}





