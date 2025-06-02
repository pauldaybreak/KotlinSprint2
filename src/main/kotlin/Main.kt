package org.example

fun main() {

        var totalSeconds = 6430L

        val hours = totalSeconds / 3600
        val ostatokSec = totalSeconds % 3600
        val minutes = ostatokSec / 60
        val seconds = ostatokSec % 60

    println(ostatokSec)
    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}