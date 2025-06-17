package lesson_9

fun main() {

    var listofProducts: List<String>

    while (true) {
        println("введите 5 продуктов ")
        val usrInput = readln()
        listofProducts = usrInput
            .split(", ")
            .map { it.trim() }
            .filter { it.isNotEmpty() }

        if (listofProducts.size <= 5) {
            break
        } else {
            println("вы ввели больше 5 продуктов")
        }
    }
        val sortedList = listofProducts.sorted()
        for (i in sortedList) {
            print("$i ")
        }


    }


