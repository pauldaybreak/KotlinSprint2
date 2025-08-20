package lesson_22

class Book(val name: String, val autor: String)

data class InfoAboutBook(val name: String, val autor: String)

fun main() {
    val regBook1 = Book("Триумфальная арка", "Эрих Мария Ремарк")
    val dataBook1 = InfoAboutBook("Бесы", "Фёдор Достоевский")
    println(regBook1) /* lesson_22.Book@27973e9b - павет, тип переменной@хешкод (адрес в куче)
                        елси переопределить метод toString() в классе Book,
                        можно вернуть и затем вывести строку со значениями полей */

    println(dataBook1) /* InfoAboutBook(name=Бесы, autor=Фёдор Достоевский) - Название класса, название = значения поля.
                        В отдичии от обычного класса, при создании датакласс объекта,
                        автоматически неявно переопределяется метод toString(),
                        и мы видим красивый вывод. */


}