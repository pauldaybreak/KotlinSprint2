package lesson_9

fun main() {
    print("Введите 5 неповторяющихся продуктов:")
    var listOfProducts = mutableListOf<String>()
    var counter = 0
    while (true) {
        if (counter < 5) {
            var usrInput = readln().toString().trim().lowercase()
            if (usrInput in listOfProducts) {
                println("такой продук уже есть в списке")
                continue
            }
            listOfProducts.add(usrInput)
            counter++
        } else {
            break
        }
    }
    val sortedList = listOfProducts.sorted()
    printInformation(sortedList as MutableList<String>)
}

fun printInformation(list: MutableList<String>) {
    for ((i, word) in list.withIndex()) {
        if (i == 0) {
            print(word.replaceFirstChar { it.uppercase() })
            print(", ")
        } else if (i == list.size - 1) {
            print(word)
        } else {
            print(word)
            print(", ")
        }

    }
}




