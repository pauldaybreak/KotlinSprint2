package lesson_16

import kotlin.math.pow

private const val PI: Double = 3.14

class Circle(
    private val radius: Int,
) {

    fun lengthOfCircle(): Double {
        return 2 * PI * radius

    }

    fun squareCircle(): Double {
        return PI * radius.toDouble().pow(2.0)

    }
}

fun main() {
    val circle1 = Circle(3)
    println("Длина окружности -  ${circle1.lengthOfCircle()}")
    println("Площадь круга - ${circle1.squareCircle()}")

}