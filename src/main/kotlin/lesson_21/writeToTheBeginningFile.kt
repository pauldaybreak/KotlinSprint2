package lesson_21

import java.io.File

fun File.writeToTheBeginningFile(word: String) {
    val currentText = this.readText()
    val result = (currentText + word.lowercase() + " ")
    writeText(result.lowercase())
}

fun main() {
    val fileName = File("C:\\MainFolder\\JavaLessons\\KotlinSprint2\\src\\main\\kotlin\\lesson_21\\testWords1.txt")
    val word = "Превед"
    val word2 = "Медвед1"
    val word3 = "Лиса2"
    val word4 = "Заяц3"
    val word5 = "Корова4"
    fileName.writeToTheBeginningFile(word)
    fileName.writeToTheBeginningFile(word2)
    fileName.writeToTheBeginningFile(word3)
    fileName.writeToTheBeginningFile(word4)
    fileName.writeToTheBeginningFile(word5)
}
