package lesson_2

/*
Расчёт времени прибытия поезда
 */

fun main() {
    val hourFrom: Int = 9 //время убытия поезда
    val minutes: Int = 40
    val timeRoad: Int = 457 // время в пути
    val hourInMinutes = 60 // константа час в минутах
    val minutesOfDay = (hourInMinutes * hourFrom) + minutes
    val timeMinutesFinish = (minutesOfDay + timeRoad) % hourInMinutes
    val timeHourFinish = (minutesOfDay + timeRoad) / hourInMinutes

    println("Поезд прибывает на станцию в - " + "%02d часов : %02d минут".format(timeHourFinish, timeMinutesFinish))
}