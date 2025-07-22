package lesson_14

abstract class Figure(
    val color: String,
) {
    abstract fun claculatePerimeter(): Double
    abstract fun calculateSquare(): Double

    companion object{
        const val PI = 3.14
    }

}