package lesson_22

class RegularBook(val name: String, val autor: String)

data class DataBook(val name: String, val autor: String)

fun main() {
    val regBook1 = RegularBook("Триумфальная арка", "Эрих Мария Ремарк")
    val regBook2 = RegularBook("Триумфальная арка", "Эрих Мария Ремарк")
    val dataBook1 = DataBook("Бесы", "Фёдор Достоевский")
    val dataBook2 = DataBook("Бесы", "Фёдор Достоевский")
    println("${regBook1.hashCode()}, $regBook1")
    println("${regBook2.hashCode()}, $regBook2")
    println(regBook1 == regBook2) //  сравниваются имя с хешкодом,  разные - false
    println(regBook1 === regBook2)  //  сравниваются имя с хешкодом, разные - false
    println("----")
    println("${dataBook1.hashCode()}, $dataBook1")
    println("${dataBook2.hashCode()}, $dataBook2")
    println(dataBook1 == dataBook2) // сравниваются поля объектов, поля одинаковы - true
    println(dataBook1 === dataBook2)  // сравниваются имя с хешкодом, ссылки разные - false
}