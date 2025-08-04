package lesson_15

interface Searchable {
    fun searchComponent()
}

open class Goods(
    val id: Int,
    val name: String,
    val countInWarehouse: Int,
)

class MusicalInstrument(
    id: Int,
    name: String,
    countInWarehouse: Int,
    val listComponentForInstrument: List<Pair<MusicalInstrumentComponent, Int>>
) : Goods(
    id, name, countInWarehouse,
), Searchable {
    override fun searchComponent() {
        println("Выполняется поиск")
    }
}

class MusicalInstrumentComponent(id: Int, name: String, countInWarehouse: Int) : Goods(
    id, name, countInWarehouse,
)

fun main() {
    val guitarStrings = MusicalInstrumentComponent(1, "Гитарные струны", 500)
    val bodyGuitar = MusicalInstrumentComponent(2, "Гитарная дека", 1000)

    val guitar1 = MusicalInstrument(
        100, "Guitar1", 10, mutableListOf(
            guitarStrings to 6,
            bodyGuitar to 1,
        )
    )
    guitar1.searchComponent()
}