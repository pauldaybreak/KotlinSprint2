package lesson_6

fun main() {
    println("Вы выбрали Регистрация, пожалуйста введите логин и пароль")
    println("Введите имя")
    var registrationName = readLine() // имя при регистрации
    println("Введите пароль")
    var registrationPassword = readLine()  // пароль при регистрации
    println("Ваше имя $registrationName и пароль $registrationPassword теперь вы можете зайти в систему")

    checkInputUserData(registrationName.toString(), registrationPassword.toString())
}

// функция проверки данных при входе
fun checkInputUserData(name: String, password: String) {
    var counter = 3 // для количества попыток
    do {
        println("Введите имя для входа")
        val inputUserName = readLine() //имя при входе
        println("Введите пароль для входа")
        val inputUserPassword = readLine() //пароль при входе

        if (inputUserName != name || inputUserPassword != password) {
            println("Авторизация не удалась, проверьте логин и пароль, количество оставшихся попыток ${--counter}")
        } else {
            println("Авторизация прошла успешно")
        }
        if (counter == 0) {
            println("Вы слишком много сделали попыток. Логин заблокирован. Обратитесь в тех. поддержку")
            break
        }
    } while (counter > 0)

}


