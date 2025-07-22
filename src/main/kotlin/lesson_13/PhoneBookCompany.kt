package lesson_13

import kotlin.random.Random

class PhoneBookCompany(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {}

fun generateNumber(): Long {
    return Random.nextLong(10000000, 900000000)
}

fun main() {
    val listWithContact = mutableListOf(
        PhoneBookCompany("Андрей", generateNumber(), "null"),
        PhoneBookCompany("Борис", generateNumber(), null),
        PhoneBookCompany("Владимир", generateNumber(), null),
        PhoneBookCompany("Генадий", generateNumber(), "Тинькофф"),
        PhoneBookCompany("Дмитрий", generateNumber(), "ЧелябМеталлИнвест"),
    )


    val listCompaniesOfPhoneBook = listWithContact.mapNotNull { it.company }.toSet()
    println("Список компаний: ${listCompaniesOfPhoneBook.joinToString(", ")}")
}
