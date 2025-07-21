package lesson_13

class PhoneBook(
    val name: String,
    val phoneNumber: Long,
    var company: String? = null
) {

    fun printInfo() {
        if(company == null) company = "<не указано>"
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: $company")
        println("---")
    }
}

fun main() {
    val abonent1 = PhoneBook(
        "Ростислав",
        89123456789,
        "Reddit"
    )
    abonent1.printInfo()

    val abonent2 = PhoneBook(
        "Ростислав",
        89123456789,
    )
    abonent2.printInfo()
}
