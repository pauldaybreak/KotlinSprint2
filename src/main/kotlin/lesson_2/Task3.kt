package lesson_2

/*
Расчёт времени прибытия поезда
 */

fun main() {
    val hourFrom: Int = 9 //время убытия поезда
    val minutes: Int = 40
    val timeRoad: Int = 457 // время в пути

    val minutesOfDay = (60 * hourFrom) + minutes
    val timeMinutesFinish = (minutesOfDay + timeRoad) % 60
    val timeHourFinish = (minutesOfDay + timeRoad) / 60

    println("Поезд прибывает на станцию в - " + "%02d часов : %02d минут".format(timeHourFinish, timeMinutesFinish))
}