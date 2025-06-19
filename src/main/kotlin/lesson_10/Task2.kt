package lesson_10

const val SIZE_LENGTH = 4

fun main() {
    registrationInSystem()
}

fun registrationInSystem() {
    var listLoginPass = mutableListOf<Pair<String, String>>()
    do {
        val usrLogin = readln().toString()
        val usrPass = readln().toString()
        listLoginPass.add(Pair(usrLogin, usrPass))
        if (validationPassword(listLoginPass)) {
            inputToSystem(listLoginPass)
        }
    } while (!validationPassword(listLoginPass))
}

fun validationPassword(listLogPass: MutableList<Pair<String, String>>): Boolean {
    for ((login, pass) in listLogPass) {
        if (login.length >= SIZE_LENGTH && pass.length >= SIZE_LENGTH) {
            println("Вы зарегистрировались в системе")
            return true
        } else {
            print("Логин и пароль недостаточны")
        }
    }
    return false
}

fun inputToSystem(listLogPass: MutableList<Pair<String, String>>) {
    val usrEntry = readln().toString()
    val passEntry = readln().toString()
    for ((login, pass) in listLogPass) {
        if (login == usrEntry && pass == passEntry) {
            println("Добро пожаловать в систему")
        } else {
            println("Логин и пароль неверны")
        }

    }
}
