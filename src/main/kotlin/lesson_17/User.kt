package lesson_17

class User(_login: String, _password: String) {
    var login = _login
        set(value) {
            field = value
            println("Логин успешно изменен на $field")
        }

    var password = _password
        get() = "*".repeat(field.length)
        set(value) {
            if (field != value) {
                println("Вы не можете изменить пароль")
            }
        }

    fun printInfo() {
        println("login - $login, password - $password")
    }
}

fun main() {
    var user1 = User("Paul", "qwert123")
    user1.login = "Pavel"
    user1.password = "ghgfh"
    user1.printInfo()
}