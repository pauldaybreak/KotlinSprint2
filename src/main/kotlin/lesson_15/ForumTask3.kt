package lesson_15

abstract class ForumTask3(
    val idUser: Int,
    val nameUser: String,
) {

    fun readMessage(message: Message) {
        println("$nameUser читает прочитал ${message.textMessage}")
    }

    fun writeMessage(idMessage: Int, textMessage: String, idUser: ForumTask3): Message {
        println("написано сообщение $idMessage, текст сообщения - $textMessage, автор - ${idUser.nameUser}")
        return Message(idMessage, textMessage)
    }
}

class User(idUser: Int, nameUser: String) : ForumTask3(idUser, nameUser) {}

class Administrator(idUser: Int, nameUser: String) : ForumTask3(idUser, nameUser) {
    fun deleteMessage(message: Message) {
        println("${message.idMessage} - написанное $nameUser, удаленно администратором")

    }
}

class Message(
    val idMessage: Int,
    val textMessage: String,
) {}

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

}


