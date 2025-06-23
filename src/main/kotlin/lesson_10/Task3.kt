package lesson_10

fun main() {
    val lengthPass: Int = readln().toInt()
    println("пароль:\n${generatePassword(lengthPass)}")
}

fun generatePassword(length: Int): String {
    val specialSymbols = 32..47
    val numberSymbols = 0..9
    val password = StringBuilder()

    (0 until length).forEach { i ->
        if (i % 2 == 0) password.append(numberSymbols.random())
        else password.append(specialSymbols.random().toChar())
    }

    return password.toString()
}
