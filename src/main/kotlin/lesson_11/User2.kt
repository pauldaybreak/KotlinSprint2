package lesson_11

class User2(
    val userId: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "я студнет KotlinSprint"
) {

    fun printUserInformation() {
        println("$userId, $login, $password, $email, $bio")
    }

    fun inputUserBioInformation() {
        println("Введите свою краткую биографию:")
        val inputUser = readln()
        bio = inputUser
    }

    fun changePassword() {
        println("Введите действующий пароль:")
        var inputPassword = readln()
        if (inputPassword == password) {
            println("Введите новый пароль:")
            var newPassword = readln()
            password = newPassword
            println("Пароль изменён")
        } else println("Введенный пароль - неверный.")
    }
}

fun main() {
    val user1: User2 = User2(
        userId = 1,
        login = "tiger2025",
        password = "qwerty123",
        email = "tiger@mail.ru"
    )
    user1.printUserInformation()
    user1.inputUserBioInformation()
    user1.changePassword()
    user1.printUserInformation()

    val user2: User2 = User2(
        userId = 2,
        login = "camel2023",
        password = "lflghkhkp",
        email = "camel@post.com",
    )
    user2.printUserInformation()
    user2.inputUserBioInformation()
    user2.changePassword()
    user2.printUserInformation()
}

