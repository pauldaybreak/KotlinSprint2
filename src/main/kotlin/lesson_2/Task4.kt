package lesson_2

/*
Расчёт ресурсов данные баффом
 */

fun main(){
    var crystalWeight = 7
    var ferrumWeight = 11
    val buff = 20

    crystalWeight = (crystalWeight * buff) / 100
    ferrumWeight = (ferrumWeight * buff) / 100

    println("Кристаллы данные баффом: " + crystalWeight)
    println("Железная руда данная баффом: " + ferrumWeight)
}