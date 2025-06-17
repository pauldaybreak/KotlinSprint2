package lesson_7

const val MIN_LENGTH_PASS = 6

fun main() {
    do {
        println("Введите число, (не меньше 6) для генерации пароля)")
        val lengthOfPass = readln().toInt()
        if (lengthOfPass < MIN_LENGTH_PASS)
            println("Вы ввели длину меньше 6 символов")
        else if (lengthOfPass >= MIN_LENGTH_PASS) {
            println("Ваш пароль: " + generationPassword(lengthOfPass).toString())
        }
    } while (lengthOfPass < MIN_LENGTH_PASS)
}

fun generationPassword(lengthPass: Int): String {
    val rangeSymbol =  ('a'..'z') + ('A'..'Z') + ('0'..'9')
    val generationPass = StringBuilder()
    for (i in 0 until lengthPass) {
        generationPass.append(rangeSymbol.random())
    }
    return generationPass.toString()

}