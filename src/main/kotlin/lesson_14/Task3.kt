package lesson_14

fun main(){
    val quadrate1 = Quadrate("black", 3, 4)
    val quadrate2 = Quadrate("white", 10, 20)
    val quadrate3 = Quadrate("black", 5, 6)

    val circle1 = Circle("black", 6)
    val circle2 = Circle("white", 7)
    val circle3 = Circle("black", 8)

    val listOfFigure = listOf(quadrate1, quadrate2, quadrate3, circle1, circle2, circle3)
    val sumPerimeterBlackFigures = listOfFigure
        .filter { it.color == "black" }
        .sumOf { it.claculatePerimeter() }

    val sumSquareWhiteFigures = listOfFigure
        .filter { it.color == "white" }
        .sumOf { it.calculateSquare() }

    println("Сумма периметров всех черных фигур $sumPerimeterBlackFigures")
    println("Сумма площадей всех белых фигур $sumSquareWhiteFigures")
}



