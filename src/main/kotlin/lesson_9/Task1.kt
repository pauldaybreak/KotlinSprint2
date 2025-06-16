package lesson_9

// Список ингридиентов

fun main(){
    var listOfIngridients: MutableList<String> = listOf("морковь", "грибы", "картошка", "свекла", "соль", "перец", "курица") as MutableList<String>
    for(i in listOfIngridients){
        println(i)
    }
}