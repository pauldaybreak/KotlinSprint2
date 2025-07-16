package lesson_1_10.lesson_9



fun main(){
    var listOfIngridients: MutableList<String> = listOf("морковь", "грибы", "картошка", "свекла", "соль", "перец", "курица") as MutableList<String>
    for(i in listOfIngridients){
        println(i)
    }
}