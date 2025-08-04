package lesson_16

class UserLogin(
    val login: String,
    private val password: String,
) {
    fun checkpassword(userInput: String): Boolean {
        return userInput == password
    }
}

fun main() {
    val user1 = UserLogin("Paul", "secretPass11")
    println(if (user1.checkpassword("secretPass11")) "Введённый пароль верный" else "Введённый пароль неверный")
}