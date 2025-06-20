package lesson_10

import lesson_6.checkInputUserData

const val DICE_SIDES = 6

fun main() {
    var countFight: Int
    do {
        println("Желаете сыграть ещё:")
        val usrChoise = readln().trim().lowercase()
        when (usrChoise) {
            "да" -> {
                println("Сколько партий хотите сыграть")
                countFight = readln().toInt()
                repeat(countFight) {
                    gameFight()
                }

                "нет" -> println("Выгрышные партии человека")


            }


        }
    }
}


fun gameFight(count: Int): Int{
    var countWinPartHuman: Int = 0
    var countWinPartTerminator: Int = 0
    var countWinBoth: Int = 0
    repeat(count) {
        var scoreHuman = roll()
        var scoreTerminator = roll()
        when{
            scoreHuman > scoreTerminator -> {
                println("Победил человек")
                countWinPartHuman++ }
            scoreHuman < scoreTerminator -> {
                println("Победил машина")
                countWinPartTerminator }
            scoreHuman == scoreTerminator -> println("Победил ничья")return "ничья"
        }


    }




    return when {
        scoreHuman > scoreTerminator -> scoreHuman
        scoreTerminator > scoreHuman -> scoreTerminator

        else -> {scoreHuman}
    }
}

fun roll(): Int {
    val count: Int = (1..DICE_SIDES).random()
    return count
}
