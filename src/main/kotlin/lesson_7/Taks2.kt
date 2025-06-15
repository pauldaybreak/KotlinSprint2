package lesson_7

// Авторизация по 4х-значному коду

fun main() {
    println("Для авторизации введите 4 значный код")
    do {
        val pass = generationPassword().toString() // вызов ф-ции генерации 4-значного кода
        println("Ваш код авторизации: " + pass)
        val inputUserPass = readln().toString()  // пользовательский ввод
        if (inputUserPass != pass) {
            println("Введён неверный код!")
            continue
        } else {
            println("Добро пожаловать в систему.")
            return
        }

    } while (inputUserPass != pass)
}

fun generationPassword(): StringBuilder {
    val numRange = 0..9
    val pass = StringBuilder()
    for (i in 1..4) {
        pass.append(numRange.random())
    }
    return pass
}