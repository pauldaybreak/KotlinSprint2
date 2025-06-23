package lesson_10

const val DICE_SIDES = 6
const val HUMAN = "человек"
const val TERMINATOR = "машина"
const val WIN_HUMAN_AND_TERMINATOR = "ничья"
const val YES = "да"
const val NO = "нет"

fun main() {
    var countPartGame = 0
    var countWinPartHuman = 0

    while (true) {
        println("Желаете сыграть ещё:")
        val userChoose = readln().trim().lowercase()
        if (userChoose == YES) {
            countPartGame++

            when (playPart()) {
                HUMAN -> {
                    println("$countPartGame - партию выйграл человек")
                    countWinPartHuman++
                }

                TERMINATOR -> {
                    println("$countPartGame - партию выйграл машина")
                }
            }
        } else if (userChoose == NO) {
            println("Число выйгранных партий человека: $countWinPartHuman")
            break
        }
    }
}

fun playPart(): String {
    var countWinPartTerminator: Int = 0
    var scoreHuman = roll()
    var scoreTerminator = roll()

    when {
        scoreHuman > scoreTerminator -> {
            println("Победил человек, $scoreHuman")
            return HUMAN
        }

        scoreHuman < scoreTerminator -> {
            countWinPartTerminator++
            println("Победил машина, $scoreTerminator")
            return TERMINATOR
        }

        scoreHuman == scoreTerminator -> {
            println("Победил ничья, человек = $scoreHuman, машина = $scoreTerminator")
            return WIN_HUMAN_AND_TERMINATOR
        }

    }
    return NO
}


fun roll(): Int {
    val count: Int = (1..DICE_SIDES).random()
    return count
}


