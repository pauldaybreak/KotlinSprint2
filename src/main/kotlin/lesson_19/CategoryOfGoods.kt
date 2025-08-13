package lesson_19

enum class CategoryOfGoods(private val description: String) {
    CLOTHES("одежда"),
    STATIONERY("канцелярские товары"),
    OTHER("разное");

    fun printInfo() {
        println(description)
    }
}

class Goods(private val id: Int, val name: String, private val category: CategoryOfGoods) {

    fun printInfo() {
        println("артикул: $id, наименование: $name, категория товара: ")
        category.printInfo()
    }
}

fun main() {

    val notebook1 = Goods(1, "блокнот1", CategoryOfGoods.STATIONERY)
    val notebook2 = Goods(2, "тетрадь", CategoryOfGoods.STATIONERY)
    val coat1 = Goods(3, "пальто", CategoryOfGoods.CLOTHES)
    val oil = Goods(4, "машинное масло Elf", CategoryOfGoods.OTHER)

    notebook1.printInfo()
    notebook2.printInfo()
    coat1.printInfo()
    oil.printInfo()
}

