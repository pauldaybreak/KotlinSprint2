package lesson_1

fun main() {
    val CONST_HOUR = 60
    val CONST_HOUR_IN_SEC = CONST_HOUR*6

    var totalSeconds = 6430L

    val hours = totalSeconds / (CONST_HOUR_IN_SEC)
    val remainigSec = totalSeconds % CONST_HOUR_IN_SEC
    val minutes = remainigSec / CONST_HOUR
    val seconds = remainigSec % CONST_HOUR

    println(remainigSec)
    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}