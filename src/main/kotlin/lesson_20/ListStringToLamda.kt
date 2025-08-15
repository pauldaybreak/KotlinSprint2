package lesson_20

fun main() {
    val listOfElements = listOf(
        "Создать",
        "Добавить",
        "Удалить",
        "Отправить",
    )
    val listOfActions: List<() -> Unit> = listOfElements.map { it ->
        { println("Нажат элемент $it") }
    }
    listOfActions.forEachIndexed { index, function ->
        if (index % 2 == 0) function()
    }
}
