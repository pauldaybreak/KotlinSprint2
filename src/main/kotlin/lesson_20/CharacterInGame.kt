package lesson_20

class CharacterInGame (val name: String, var currentHalth: Int, val maximumHealth: Int = 100)

fun main() {
    val medical: (CharacterInGame) -> Unit = { health ->
        health.currentHalth = health.maximumHealth
    }
    val player1: CharacterInGame = CharacterInGame("Max Payne", 20)
    println("${player1.name}, ${player1.currentHalth}")
    medical(player1)
    println("${player1.name}, ${player1.currentHalth}")

}