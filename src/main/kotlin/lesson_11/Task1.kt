package lesson_11

class User(
    val userId: Int,
    val login: String,
    val password: String,
    val email: String,
) {}

fun main() {
    val user1: User = User(
        userId = 1,
        login = "tiger2025",
        password = "rfvcdewxx",
        email = "tiger@mail.ru"
    )
    val user2: User = User(
        userId = 2,
        login = "camel2023",
        password = "lflghkhkp",
        email = "camel@post.com"
    )
    println("${user1.userId}, ${user1.login}, ${user1.password}, ${user1.email}")
    println("${user2.userId}, ${user2.login}, ${user2.password}, ${user2.email}")

}

