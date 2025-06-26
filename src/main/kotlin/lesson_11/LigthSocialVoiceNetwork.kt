package lesson_11

import lesson_11.LigthSocialVoiceNetwork.Room
import lesson_11.LigthSocialVoiceNetwork.User

class LigthSocialVoiceNetwork(

) {
    class Room(
        var idRoom: Int,
        var coverRoom: String,
        var nameOfRoom: String,
        var listUsersOfRoom: MutableList<User>? = mutableListOf<User>()
    ) {

        fun addUserToRoom(userToRoom: User) {
            listUsersOfRoom?.add(userToRoom)
            println("${userToRoom.nameUser}: добавлен в комнату: ${nameOfRoom}")
        }

        fun printInfoRoom(id: Int) {
            println("$id, $nameOfRoom, $coverRoom, ${listUsersOfRoom?.joinToString { it.nameUser }}")
        }
    }

    class User(
        var idUser: Int,
        var nameUser: String,
        var avatarUser: String,
        var statusUser: String = "пользователь заглушен",
    ) {

        fun installStatusUser(user: User) {

            while (true) {
                println("Выберите цифру что бы установить статус у пользователя: ${user.nameUser}")
                println("1) разговаривает, 2) микрофон выключен, 3) пользователь заглушен")
                var status = readln()
                if (status.isEmpty()) {
                    println("Вы ничего не ввели")
                    continue
                }

                when (status) {
                    "1" -> this.statusUser = "разговаривает"
                    "2" -> this.statusUser = "микрофон выключен"
                    else -> this.statusUser = "пользователь заглушен"
                }
                break
            }
        }

        fun tapLongToAvatarUser(user: User) {
            println("Симуляция долгого тапа по аватару. Нажми 5 раз Enter")
            var counter = 0
            while (true) {
                var longTapSec = readln()
                counter++
                if (counter == 5) {
                    printInformationAboutUser(user)
                    break
                }
            }
        }

        fun printInformationAboutUser(user: User) {
            println("Инфо о пользователе: ${user.avatarUser}, ${user.idUser}, ${user.nameUser}, ${user.statusUser}")
        }
    }
}

fun main() {
    var user1 = User(1, "Paul", "avatar_paul.bmp")
    user1.installStatusUser(user1)
    user1.tapLongToAvatarUser(user1)

    var user2 = User(2, "Андрей", "avatar_andrew.bmp")
    user2.installStatusUser(user2)
    user2.tapLongToAvatarUser(user2)

    var user3 = User(3, "Филлип", "avatar_fillip.bmp")
    user3.installStatusUser(user3)
    user3.tapLongToAvatarUser(user3)

    var room1 = Room(1, "picture_room1.bmp", "Городской чат Сергиев Посад")
    var room2 = Room(2, "picture_room2.bmp", "Зеленоград чат")
    var room3 = Room(3, "picture_room3.bmp", "Солнечногорск чатъ")
    room1.addUserToRoom(user2)
    room1.addUserToRoom(user3)
    room1.printInfoRoom(1)

    room2.addUserToRoom(user1)
    room2.addUserToRoom(user2)
    room2.printInfoRoom(2)

    room3.addUserToRoom(user1)
    room3.addUserToRoom(user3)
    room3.printInfoRoom(3)
}










