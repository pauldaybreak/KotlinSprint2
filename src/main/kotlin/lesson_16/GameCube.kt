package lesson_16

class GameCube {
    private val numberOnSideCube = (1..6).random()

    fun printNumber() {
        println(numberOnSideCube)
    }
}

fun main() {
    val game1 = GameCube()
    game1.printNumber()
}