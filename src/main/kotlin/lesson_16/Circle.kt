package lesson_16

private const val PI: Double = 3.14

class Circle(
    private val radius: Int,
) {

    fun lengthOfCircle(): Double {
        val a = 2 * PI * radius
        return a
    }

    fun squareCircle(): Double {
        val square = PI * (radius * radius)
        return square
    }
}

fun main() {
    val circle1 = Circle(3)
    println("Длина окружности -  ${circle1.lengthOfCircle()}")
    println("Площадь круга - ${circle1.squareCircle()}")

}