package lesson_22

class RegularBook(val name: String, val autor: String)

data class DataBook(val name: String, val autor: String)

fun main() {
    val regBook1 = RegularBook("Триумфальная арка", "Эрих Мария Ремарк")
    val regBook2 = RegularBook("Триумфальная арка", "Эрих Мария Ремарк")
    val dataBook1 = DataBook("Бесы", "Фёдор Достоевский")
    val dataBook2 = DataBook("Бесы", "Фёдор Достоевский")
    println(regBook1 == regBook2) // сравниваются сслыки, разные - false
    println(regBook1 === regBook2)  // сравниваются сслыки, разные - false
    println("----")
    println(dataBook1 == dataBook2) // сравниваются значения полей, значения одинаковы - true
    println(dataBook1 === dataBook2)  // сравниваются ссылки, разные - false
}