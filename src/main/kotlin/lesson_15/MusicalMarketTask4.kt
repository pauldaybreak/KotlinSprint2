package lesson_15

open class MusicalMarketTask4(
    val idGoods: Int,
    val nameGoods: String,
    val price: Double,
) {}

class MusicalInstrument(
    idGoods: Int,
    nameGoods: String,
    price: Double,
    val listComponentForInstrument: MutableList<Pair<MusicalСomponent, Int>>?
) : MusicalMarketTask4(
    idGoods, nameGoods,
    price,
) {}

class MusicalСomponent(idGoods: Int, nameGoods: String, price: Double) : MusicalMarketTask4(
    idGoods, nameGoods, price,
) {}

class Warehouse(val idWarehouse: Int, var stockOnWarehouse: MutableList<Pair<MusicalMarketTask4, Int>>)

interface Searchable {
    fun search(word: String, database: Warehouse) {
        println("Выполняется поиск по базе данных товара $word")
    }
}

fun main() {
    val guitarStrings = MusicalСomponent(1, "Гитарные струны", 500.00)
    val bodyGuitar = MusicalСomponent(2, "Гитарная дека", 1000.00)
    val drumstick = MusicalСomponent(3, "Барабанные палочки", 700.00)
    val cable = MusicalСomponent(4, "Кабель для усилителя", 300.54)


    val guitar = MusicalInstrument(
        500, "Гитара", 5000.10,
        mutableListOf(
            guitarStrings to 6,
            bodyGuitar to 1
        )
    )

    val saksofon = MusicalInstrument(502, "Саксофон", 7000.00, null)

    val dramMachine = MusicalInstrument(
        503, "Барабаны", 15000.43,
        mutableListOf(
            drumstick to 2,
            cable to 1
        )
    )

    val warehouse1 = Warehouse(
        1, mutableListOf(
            guitarStrings to 100,
            bodyGuitar to 10,
            drumstick to 50,
            saksofon to 20,
        )
    )
    val found = object : Searchable {}
    found.search("Барабаны", warehouse1)
}