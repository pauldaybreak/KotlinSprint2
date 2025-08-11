package lesson_18

open class Dice(
) {
    open val countSide: Int = 0
    open fun play(): Int {
        return (1..countSide).random()
    }

    open fun printInfo() {
        println(play())
    }
}

class Dice4() : Dice() {
    override val countSide: Int = 4

    override fun printInfo() {
        println("На кубике с $countSide гранями выпало ${play()}")
    }
    override fun play(): Int {
        return (1..countSide).random()
    }
}

class Dice6() : Dice() {
    override val countSide: Int = 6

    override fun printInfo() {
        println("На кубике с $countSide гранями выпало ${play()}")
    }
    override fun play(): Int {
        return (1..countSide).random()

    }
}

class Dice8() : Dice() {
    override val countSide: Int = 8

    override fun printInfo() {
        println("На кубике с $countSide гранями выпало ${play()}")
    }
    override fun play(): Int {
        return ((1..countSide).random())
    }
}

fun main() {
    val dice1 = Dice4()
    val dice2 = Dice6()
    val dice3 = Dice8()
    val listOfDices = listOf(dice1, dice2, dice3)
    for (i in listOfDices) {
        i.printInfo()
    }
}

