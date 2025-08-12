package lesson_18

abstract class BoxesGabaritParcel(val sideA: Int) {
    abstract fun calculateSquare(): Int
}

class CubeParcel(sideA: Int) : BoxesGabaritParcel(sideA) {
    override fun calculateSquare(): Int {
        println("эта посылка - куб, она имеет длину ребра $sideA")
        return sideA * sideA
    }
}

class RectangleParcel(sideA: Int, val sideB: Int, val sideC: Int) : BoxesGabaritParcel(sideA) {
    override fun calculateSquare(): Int {
        val square: Int = sideA * sideB
        println("эта послылка - прямоугольник, она имеет площадь $square")
        return square
    }
}

fun createBoxes(sideA: Int, sideB: Int, sideC: Int): Int {
    return if (sideA == sideB && sideB == sideC) {
        CubeParcel(sideA).calculateSquare()
    } else {
        RectangleParcel(sideA, sideB, sideC).calculateSquare()
    }
}

fun main() {
    createBoxes(2, 2, 2)
    createBoxes(3, 4, 5)
}




