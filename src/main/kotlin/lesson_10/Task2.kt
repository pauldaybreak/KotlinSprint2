package lesson_10

const val MIN_LENGTH_DATA = 4

fun main() {
    registrationInSystem()
}

fun registrationInSystem() {
    var usrLogin: String
    var usrPass: String

    do {
        println("Логин для регистрации")
        usrLogin = readln().trim()
        println("Пароль для регистрации")
        usrPass = readln().trim()

    } while (!validationPassword(usrLogin, usrPass))

    val resultEntry = inputToSystem(usrLogin, usrPass)

    when (resultEntry) {
        true -> println("Вход выполнен")
        false -> println("Вход не выполнен")
    }
}

fun validationPassword(login: String, pass: String): Boolean {
    val result: Boolean

    if (login.length >= MIN_LENGTH_DATA && pass.length >= MIN_LENGTH_DATA) {
        result = true
        println("Вы зарегистрировались")
    } else {
        println("Длина логина или пароля недостаточна")
        result = false
    }
    return result
}

fun inputToSystem(login: String, pass: String): Boolean {
    println("Введите логин для входа")
    val usrEntry = readln()
    println("Введите пароль для входа")
    val passEntry = readln()

    return when {
        login == usrEntry && pass == passEntry -> true
        else -> false
    }

}