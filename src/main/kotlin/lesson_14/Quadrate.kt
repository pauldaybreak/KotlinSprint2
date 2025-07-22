package lesson_14

class Quadrate(
    color: String,
    val sideA: Int,
    val sideB: Int,
) : Figure(color) {
    override fun claculatePerimeter(): Double {
        return ((sideA + sideB) * 2).toDouble()
    }

    override fun calculateSquare(): Double {
        return (sideA * sideB).toDouble()
    }
}
