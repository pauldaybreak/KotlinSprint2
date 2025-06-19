package lesson_10

const val SIZE_ROW = 4

fun main() {
    registrationInSystem()
}

fun registrationInSystem() {
    var listLoginPass = mutableListOf<Pair<String, String>>()
    do {
        println("Логин для регистрации")
        val usrLogin = readln().toString().trim()
        println("Пароль для регистрации")
        val usrPass = readln().toString().trim()
        listLoginPass.add(Pair(usrLogin, usrPass))

    } while (!validationPassword(listLoginPass))

    val resultEntry = inputToSystem(listLoginPass)
    when (resultEntry) {
        true -> println("Вход выполнен")
        false -> println("Вход не выполнен")

    }
}

fun validationPassword(listLogPass: MutableList<Pair<String, String>>): Boolean {
    return listLogPass.map { (login, pass) ->
        login.length >= SIZE_ROW && pass.length >= SIZE_ROW
    }.also { results ->
        if (!results.contains(true)) {
            println("Логин или пароль недостаточно длинные")
        }
    }.contains(true)
    println("Вы зарегистрировались")
}

fun inputToSystem(listLogPass: MutableList<Pair<String, String>>): Boolean {
    println("Введите логин для входа")
    val usrEntry = readln().toString()
    println("Введите пароль для входа")
    val passEntry = readln().toString()
    val result = listLogPass.map { (login, pass) -> login == usrEntry && pass == passEntry }
        .contains(true)
    return result

}