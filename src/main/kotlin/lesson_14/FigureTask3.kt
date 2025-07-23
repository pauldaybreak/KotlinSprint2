package lesson_14

import lesson_14.FigureTask3.Companion.COLOR_BLACK
import lesson_14.FigureTask3.Companion.COLOR_WHITE

abstract class FigureTask3(
    val color: String,
) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateSquare(): Double

    companion object {
        const val PI = 3.14
        const val COLOR_BLACK = "черный"
        const val COLOR_WHITE = "белый"
    }
}

class Circle(
    color: String,
    val radius: Int,
) : FigureTask3(color) {

    override fun calculateSquare(): Double {
        return PI * (radius * radius)
    }

    override fun calculatePerimeter(): Double {
        return 2 * PI * radius
    }
}

class Quadrate(
    color: String,
    val sideA: Int,
    val sideB: Int,
) : FigureTask3(color) {
    override fun calculatePerimeter(): Double {
        return ((sideA + sideB) * 2).toDouble()
    }

    override fun calculateSquare(): Double {
        return (sideA * sideB).toDouble()
    }
}

fun main() {
    val quadrate1 = Quadrate(COLOR_BLACK, 3, 4)
    val quadrate2 = Quadrate(COLOR_WHITE, 10, 20)
    val quadrate3 = Quadrate(COLOR_BLACK, 5, 6)

    val circle1 = Circle(COLOR_BLACK, 6)
    val circle2 = Circle(COLOR_WHITE, 7)
    val circle3 = Circle(COLOR_BLACK, 8)

    val listOfFigure = listOf(quadrate1, quadrate2, quadrate3, circle1, circle2, circle3)
    val sumPerimeterBlackFigures = listOfFigure
        .filter { it.color == COLOR_BLACK }
        .sumOf { it.calculatePerimeter() }

    val sumSquareWhiteFigures = listOfFigure
        .filter { it.color == COLOR_WHITE }
        .sumOf { it.calculateSquare() }

    println("Сумма периметров всех черных фигур $sumPerimeterBlackFigures")
    println("Сумма площадей всех белых фигур $sumSquareWhiteFigures")

}




