package lesson_20

fun main(){
    val helloUser: (String) -> String = { userName -> "С наступающим Новым Годом, $userName" }
    println(helloUser("Надежда"))
}