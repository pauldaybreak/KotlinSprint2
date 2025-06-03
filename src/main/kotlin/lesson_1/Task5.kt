package lesson_1

fun main() {

    var totalSeconds = 6430L

    val hours = totalSeconds / 3600
    val remainigSec = totalSeconds % 3600
    val minutes = remainigSec / 60
    val seconds = remainigSec % 60

    println(remainigSec)
    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}