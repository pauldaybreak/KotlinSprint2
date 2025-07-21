package lesson_13

import kotlin.random.Random

class PhoneBookCompany(
    var name: String,
    var phoneNumber: Long,
    var company: String? = null,
) {
    fun printInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: $company")
        println("---")
    }

}

fun generateNumber(): Long {
    return Random.nextLong(10000000, 900000000)
}

fun generateChoiseCompany(): String {
    val listOfCompany = listOf<String>(
        "Яндекс",
        "Сбербанк",
        "X5 Group",
        "Тинькофф",
        "Ozon",
        "Wildberries",
        "null",
    )
    return listOfCompany.random().toString()
}

fun main() {
    var listWithContact = mutableListOf(
        PhoneBookCompany("Андрей", generateNumber(), "null"),
        PhoneBookCompany("Борис", generateNumber(), null),
        PhoneBookCompany("Владимир", generateNumber(), null),
        PhoneBookCompany("Генадий", generateNumber(), generateChoiseCompany()),
        PhoneBookCompany("Дмитрий", generateNumber(), generateChoiseCompany()),
    )
    for (i in listWithContact) {
        i.printInfo()
    }

    val listCompaniesOfPhoneBook = listWithContact.mapNotNull { it.company }.toSet()
    for (i in listCompaniesOfPhoneBook) {
        println(i)
    }
}
