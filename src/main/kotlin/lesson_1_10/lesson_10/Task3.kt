package lesson_1_10.lesson_10

fun main() {
    println("Введите пожалуйста длину пароля: ")
    val lengthPass: Int = readln().toInt()
    println("пароль:\n${generatePassword(lengthPass)}")
}

fun generatePassword(length: Int): String {
    val specialSymbols = ' '..'/'
    val numberSymbols = 0..9
    val password = StringBuilder()

    for (i in 0 until length){
        if (i % 2 == 0) password.append(numberSymbols.random())
        else password.append(specialSymbols.random())
    }

    return password.toString()
}
