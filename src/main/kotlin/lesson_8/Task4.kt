package lesson_8

//  Замена продуктов из списка

fun main() {
    var ingridients = arrayOf("морковь", "грибы", "картошка", "свекла", "соль", "перец", "курица")
    println(ingridients.joinToString())
    println("введите продукт из списка который хотите поменять")
    val userQuery = readln().toString().trim()
    var fIndex = -1
    for (i in ingridients.indices) {
        if (userQuery == ingridients[i]) {
            fIndex = i
        }
    }
    if (fIndex != -1) {
        val renameUserQuery = readln().toString().trim()
        ingridients.set(fIndex, renameUserQuery)
        println("обновлённый список продуктов: ${ingridients.joinToString()}")
    } else {
        println("нет такого продукта")
    }

}




