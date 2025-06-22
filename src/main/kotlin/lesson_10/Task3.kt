package lesson_10

fun main() {
    val lengthPass: Int = readln().toInt() / 2
    println("пароль:\n${generatePassword(lengthPass)}")
}

fun generatePassword(length: Int): String {
    val specialSymbols = " !\"#\$%&'()*+,-./"
    val numSymbols = 0..9
    val password = StringBuilder()

    for (i in 0 until length) {
        if (i % 2 == 0) {
            password.append(numSymbols.random())
        } else {
            password.append(specialSymbols.random())
        }
        return password.toString()
    }
}
