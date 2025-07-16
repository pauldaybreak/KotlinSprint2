package lesson_13

class Task2(
    var name: String,
    var phoneNumber: Long,
    var company: String? = null ?: "<не указано>"
) {

    fun printInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: $company")
    }
}

fun main() {
    val abonent1 = Task2(
        "Ростислав",
        89123456789,
        "Reddit"
    )
    abonent1.printInfo()

    val abonent2 = Task2(
        "Ростислав",
        89123456789,
    )
    abonent2.printInfo()
}
