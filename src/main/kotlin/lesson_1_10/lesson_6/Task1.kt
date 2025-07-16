package lesson_1_10.lesson_6

import kotlin.random.Random

fun main() {
    println("Вы выбрали Регистрация, пожалуйста введите логин и пароль")
    println("Введите имя")
    var registrationName = readln() // имя при регистрации
    println("Введите пароль")
    var registrationPassword = readln()  // пароль при регистрации
    println("Ваше имя $registrationName и пароль $registrationPassword теперь вы можете зайти в систему")

    checkInputUserData(registrationName.toString(), registrationPassword.toString())
}

// функция проверки данных при входе
fun checkInputUserData(name: String, password: String) {
    var counter = 3 // для количества попыток
    do {
        println("Введите имя для входа")
        val inputUserName = readln() //имя при входе
        println("Введите пароль для входа")
        val inputUserPassword = readln() //пароль при входе
        if (inputUserName != name || inputUserPassword != password) {
            println("Авторизация не удалась, проверьте логин и пароль, количество оставшихся попыток ${--counter}")
        } else {
            println("Логин и пароль подходят. Докажи что ты не робот")
            var countTryMathTest = 3

            do {
                val num1 = Random.nextInt(1, 9)
                val num2 = Random.nextInt(1, 9)
                val trueResult = num1 + num2
                println("Какой будет результат сложения чисел $num1 и $num2 ?")
                val userResult = readln().toInt()
                if (userResult == trueResult) {
                    println("Добро пожаловать!")
                    return
                } else {
                    println("Результат сложения неверный, осталось ${--countTryMathTest} ")
                }
                if (countTryMathTest == 0){
                    println("Доступ запрещен")
                    return
                }
            } while (countTryMathTest > 0)
        }
            if (counter == 0) {
                println("Вы слишком много сделали попыток. Логин заблокирован. Обратитесь в тех. поддержку")
                break
            }
        } while (counter > 0)

 }



