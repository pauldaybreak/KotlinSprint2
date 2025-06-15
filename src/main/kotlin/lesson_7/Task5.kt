package lesson_7

// Генерация пароля

const val MIN_LENGTH_PASS = 6 // Минимальная длина пароля

fun main() {
    do {
        println("Введите число, которое будет длинной для сгенерированного пароля. Число-длина пароля, должна быть не менее 6")
        val lengthOfPass = readln().toInt() // пользовательский ввод длины пароля
        if (lengthOfPass < MIN_LENGTH_PASS)
            println("Вы ввели длину меньше 6 символов")
        else if (lengthOfPass >= MIN_LENGTH_PASS) {
            println("Ваш пароль: " + generationPassword(lengthOfPass).toString())
        }
    } while (lengthOfPass < MIN_LENGTH_PASS)
}

// ф-ция генерации пароля с длиной от пользователя

fun generationPassword(lengthPass: Int): String {
    val rangeSymbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghiklmnopqrstuvwxyz1234567890"
    val generationPass = StringBuilder()
    for (i in 0 until lengthPass) {
        generationPass.append(rangeSymbol.random())
    }
    return generationPass.toString()

}