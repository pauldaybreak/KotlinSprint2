package lesson_13

class PhoneBookWithInput(
    val name: String,
    val phoneNumber: Long?,
    val company: String? = null
) {
    fun printInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: $company")
        println("---")
    }
}

fun inputInfo(): PhoneBookWithInput {
    while (true) {
        println("ВВедите имя абонента")
        val nameAbonent = readln()
        if (nameAbonent.isBlank()) {
            println("Имя не может быть пустым.")
            continue
        }
        println("ВВедите номер телефона")
        val phoneNumber = readln().toLongOrNull()
        if (phoneNumber == null) {
            println("Вы не ввели телефон, возврат в начало")
            continue
        }

        println("ВВедите название компании")
        val inputNameCompany = readln().toString()
        var nameCompany = if (inputNameCompany.isNullOrBlank()) null else inputNameCompany

        val contact = PhoneBookWithInput(
            nameAbonent,
            phoneNumber,
            nameCompany
        )

        return contact

    }
}

var listWithContact = mutableListOf<PhoneBookWithInput>()

fun addContactToList() {
    listWithContact.add(inputInfo())
}

fun main() {
    while (true) {
        println("Введите add - для добавления контакта \nexit - для выхода")
        val command = readln().lowercase()
        if (command == "add") {
            addContactToList()
            continue
        } else if (command == "exit")
            for (i in listWithContact) {
                i.printInfo()
            }
        println("Выход из программы")
        break
    }
}

