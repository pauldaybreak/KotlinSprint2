package lesson_1_10.lesson_2

/* Подсчёт среднего балла студентов
углублённо изучающих английский язык
 */

fun main(){
    val resultStudent1 = 3 // оценка студента
    val resultStudent2 = 4
    val resultStudent3 = 3
    val resultStudent4 = 5

    val countOfStudents = 4 // количетсво студентов
    val averageResultOfStudents: Double = (resultStudent1 + resultStudent2 + resultStudent3 + resultStudent4).toDouble() / countOfStudents

    print(averageResultOfStudents)
}