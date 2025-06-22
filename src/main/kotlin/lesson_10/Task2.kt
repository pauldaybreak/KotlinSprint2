package lesson_10



const val MIN_LENGTH_DATA = 4

fun main() {
    registrationInSystem()
}

fun registrationInSystem() {
    val userLogin: String
    val userPassword: String

    while (true) {
        println("Логин для регистрации")
        userLogin = readln().trim()
        println("Пароль для регистрации")
        userPassword = readln().trim()

        val resultEntry = isValid(userLogin, userPassword)

        when (resultEntry) {
            true -> println("Вы зарегистрировались")
            false -> println("Логин или пароль недостаточно длинные")
        }

        return
    }
}

fun isValid(login: String, pass: String): Boolean {
    val result: Boolean = login.length >= MIN_LENGTH_DATA && pass.length >= MIN_LENGTH_DATA

    return result
}

