package lesson_17

class ShipSpaceGame(name: String, middleSpeed: Int, homePort: String) {
    var name: String = name
        get() = field
        set(value: String) {
            if (field != value) {
                println("нельзя менять имя корабля")
            }
        }
    val middleSpeed: Int = middleSpeed
        get() = field

    val homePort: String = homePort
        get() = field
}

fun main() {
    var ship1 = ShipSpaceGame("Ship4000", 500, "Laguna")
    ship1.name = "ship5000"
    println("${ship1.name}, ${ship1.middleSpeed}, ${ship1.homePort}")
}