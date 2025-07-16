package lesson_13

class PhoneBookEntry(
    val name: String,
    var phoneNumber: Long,
    var company: String?
) {

    fun printInfo() {
        println("Имя: $name, Номер телефона: $phoneNumber, Компания: $company")
    }
}

fun main() {
    val abonent1 = PhoneBookEntry(
        "Petr Ivanov",
        89291234567,
        null
    )
    abonent1.printInfo()
    abonent1.company = "Google"
    abonent1.printInfo()

}

