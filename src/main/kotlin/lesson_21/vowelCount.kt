package lesson_21

fun String.vowelCount(): Int {
    val vowelWords = "A,E,I,O,U,a,e,i,o,u"
    var counter = 0
    this.map { if (it in vowelWords) counter++ }
    return counter
}

fun main() {
    val str1 = "hello"
    println(str1.vowelCount())
}