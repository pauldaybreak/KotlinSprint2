package org.example.Lesson2

fun main(){
    val quantityWorkers : Int = 50
    val salaryWorker : Int = 30000
    val salaryIntern : Int = 20000
    val quantityIntern : Int = 30

    val costWorkers = quantityWorkers * salaryWorker
    val costWorkersAndIntern = costWorkers + (salaryIntern * quantityIntern)
    val middleCost =  costWorkersAndIntern/(quantityWorkers + quantityIntern)

    println("costWorkers $costWorkers, costWorkersAndIntern $costWorkersAndIntern, middleCost $middleCost")
}