package lesson_7

fun main() {
    println("Для авторизации введите 4 значный код")
    do {
        val pass = generationPassword().toString()
        println("Ваш код авторизации: " + pass)
        val inputUserPass = readln().toString()
        if (inputUserPass != pass) {
            println("Введён неверный код!")
            continue
        } else {
            println("Добро пожаловать в систему.")
            return
        }

    } while (inputUserPass != pass)
}

fun generationPassword(): Int {
    val pass = (1000..9999).random()
    return pass

}