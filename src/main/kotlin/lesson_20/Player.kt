package lesson_20

class Player(val name: String, var haveKey: Boolean)

fun main() {
    val openDoor: (Player) -> String = { key ->
        if (key.haveKey) "Дверь открыта" else "Игрок не имеет ключа"
    }
    val player1: Player = Player("Max Payne", false)
    openDoor(player1)
    player1.haveKey = true
    openDoor(player1)
}
