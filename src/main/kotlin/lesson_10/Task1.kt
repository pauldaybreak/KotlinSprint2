package lesson_10

const val DICE_SIDES = 6

fun main() {
    var sumHuman = 0
    var sumTerminator = 0
    val countGame: Int = readln().toInt()
    repeat(countGame) {
        sumHuman += rool()
        sumTerminator += rool()
    }
    when {
        sumHuman > sumTerminator -> println("победил человек: $sumHuman")
        sumHuman < sumTerminator -> println("победил машина $sumTerminator")
        else -> println("победила дружба - человек: $sumHuman , машина $sumTerminator")

    }
}

fun rool(): Int {
    val count: Int = (1..DICE_SIDES).random()
    return count
}
