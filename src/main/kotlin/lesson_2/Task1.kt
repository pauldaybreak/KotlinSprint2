package lesson_2

fun main(){
    val resultStudent1 = 3 // оценка студента
    val resultStudent2 = 4
    val resultStudent3 = 3
    val resultStudent4 = 5
    val resultToDouble = 1.0 // что б средняя оценка была Double
    val countOfStudents = 4 // количетсво студентов
    val averageResultOfStudents: Double = (resultStudent1 + resultStudent2 + resultStudent3 + resultStudent4) * resultToDouble / countOfStudents

    print(averageResultOfStudents)
}