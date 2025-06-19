package lesson_10

fun main() {
    val lengthPass: Int = readln().toInt() / 2
    println("пароль:\n${generationPass(lengthPass)}")
}

fun generationPass(length: Int): String {
    val specialsymbols = " !\"#\$%&'()*+,-./"
    val numSymbols = 0..9
    val pass = StringBuilder()

    repeat(length) {
        pass.append(numSymbols.random(), specialsymbols.random())
    }
    return pass.toString()
}