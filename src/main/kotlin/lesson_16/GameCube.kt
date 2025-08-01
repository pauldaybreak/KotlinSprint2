package lesson_16

import kotlin.random.Random

class GameCube{
    private val numberOnSideCube = Random.nextInt(1, 7)

    fun printNumber(){
        println(numberOnSideCube)
    }
}

fun main(){
    val game1 = GameCube()
    game1.printNumber()
}