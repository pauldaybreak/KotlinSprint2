package lesson_15

abstract class ForumUser(
    val id: Int,
    val name: String,
) {

    fun readMessage(message: Message) {
        println("$name читает прочитал ${message.text}")
    }

    fun writeMessage(idMessage: Int, textMessage: String, idUser: ForumUser): Message {
        println("написано сообщение $idMessage, текст сообщения - $textMessage, автор - $name")
        return Message(idMessage, textMessage)
    }
}

class User(id: Int, name: String) : ForumUser(id, name)

class Administrator(id: Int, name: String) : ForumUser(id, name) {
    fun deleteMessage(message: Message) {
        println("Сообщение под номером ${message.id}, удаленно администратором")

    }

    fun deleteUser(user: ForumUser) {
        println("пользователь ${user.name} удален администратором")
    }
}

class Message(
    val id: Int,
    val text: String,
)

fun main() {
    val user1 = User(1, "Andrej")
    val user2 = User(2, "Boris")
    val admin1 = Administrator(3, "Georgy")
    val admin2 = Administrator(4, "Valentin")
    val message1 = user1.writeMessage(1, "Привет", user1)
    val message2 = user2.writeMessage(2, "ТЕКСТТЕКСТТКЕКСТ", user2)
    val message3 = admin1.writeMessage(3, "fkgdfgdfk", admin1)
    user1.readMessage(message3)
    admin1.deleteMessage(message1)
    admin2.deleteMessage(message2)
    admin1.deleteMessage(message3)
    admin1.deleteUser(user1)

}


