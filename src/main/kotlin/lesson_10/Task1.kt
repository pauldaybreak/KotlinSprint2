package lesson_10

import kotlin.collections.mutableListOf
import kotlin.random.Random

fun main(){
    var score = mutableListOf<Pair<Int, String>>()
    val countGame: Int = readln().toInt()
    for(i in 0 until countGame){
        val humanGame = kickOfGameBox()
        println("бросает человек $humanGame")
        score.add(humanGame to "человек")
        val terminatorGame = kickOfGameBox()
        println("бросает машина $terminatorGame")
        score.add(terminatorGame to "бросает машина")

    }
    sumOfScores(score)

}

fun kickOfGameBox(): Int{
    val count: Int = Random.nextInt(1,6)
    return count
}

fun sumOfScores(score: MutableList<Pair<Int, String>>){
    for(i in score){
        if(values == "")
        print(" $i")
    }
}