package lesson_17

class ElementOfQuiz(question: String, answer: String) {
    val question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val question1 = ElementOfQuiz("Что это такое?", "Это вода")
}
