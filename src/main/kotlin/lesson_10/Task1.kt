package lesson_10

const val DICE_SIDES = 6

fun main() {
    var sumHuman = 0
    var sumTerminator = 0
    println("Пожалуйста введите количество ходов:")
    val countGame: Int = readln().toInt()

    repeat(countGame) {
        sumHuman += roll()
        sumTerminator += roll()
    }

    when {
        sumHuman > sumTerminator -> println("победил человек: $sumHuman")
        sumHuman < sumTerminator -> println("победил машина $sumTerminator")
        else -> println("победила дружба - человек: $sumHuman , машина $sumTerminator")

    }
}

fun roll(): Int {
    val count: Int = (1..DICE_SIDES).random()
    println("выпавшее число: $count")
    return count
}
