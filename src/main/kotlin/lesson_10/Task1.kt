package lesson_10

import kotlin.collections.mutableListOf
import kotlin.random.Random

const val SIZE_KUBIK = 6

fun main() {
    val score = mutableListOf<Pair<Int, String>>()
    println("Введите количество бросков")
    val countGame: Int = readln().toInt()
    for (i in 0 until countGame) {
        val humanGame = kickOfGameBox()
        println("бросает человек $humanGame")
        score.add(humanGame to "человек")
        val terminatorGame = kickOfGameBox()
        println("бросает машина $terminatorGame")
        score.add(terminatorGame to "машина")

    }
    sumOfScores(score)

}

fun kickOfGameBox(): Int = Random.nextInt(1, SIZE_KUBIK)

fun sumOfScores(score: MutableList<Pair<Int, String>>) {
    var sumScoreHuman: Int = 0
    var sumScoreTerminator: Int = 0
    for ((value, player) in score) {
        if (player == "человек") {
            sumScoreHuman += value

        } else if (player == "машина") {
            sumScoreTerminator += value
        }
    }
    println("Человек $sumScoreHuman, Машина $sumScoreTerminator")
    if (sumScoreHuman > sumScoreTerminator) println("Человек победил $sumScoreHuman")
    else println("Машина победила $sumScoreTerminator")
}

