package lesson_2

fun main() {
    val hourTo = 9
    val minutes = 40
    val timeRoad = 457

    val minutesOfDay = (60 * hourTo) + minutes
    val timeMinutesFinish = (minutesOfDay + timeRoad) % 60
    val timeHourFinish = (minutesOfDay + timeRoad) / 60

    println("%02d:%02d".format(timeHourFinish, timeMinutesFinish))
}