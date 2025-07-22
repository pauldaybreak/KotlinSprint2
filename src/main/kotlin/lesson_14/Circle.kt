package lesson_14

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {

    override fun calculateSquare(): Double {
        return PI * (radius * radius)
    }

    override fun claculatePerimeter(): Double {
        return 2 * PI * radius
    }


}