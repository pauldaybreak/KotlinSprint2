package lesson_18

class Order(
    val id: Int,
    ) {
    fun printInfo(goods: String) {
        println("Заказан товар: $goods")
    }
    fun printInfo(goods: List<String>) {
        println("Заказаны следующие товары: $goods")
    }
}

fun main() {
    val order1 = Order(1)
    val order2 = Order(2)
    order1.printInfo("молоко")
    order2.printInfo(listOf("хлеб", "вода", "мука", "чеснок"))
}