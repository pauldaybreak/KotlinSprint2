package lesson_15

interface Swimmable {
    fun swim()
}

interface Flyable {
    fun fly()
}

class Fish(
    val name: String,
) : Swimmable {
    override fun swim() {
        println("$name, плывёт")
    }
}

class Seagull(
    val name: String,
) : Flyable {
    override fun fly() {
        println("$name, летит")
    }
}

class Duck(
    val name: String,
) : Flyable, Swimmable {
    override fun fly() {
        println("$name : летит")
    }

    override fun swim() {
        println("$name : плывёт")
    }
}

fun main() {
    val crucianCarp = Fish("Карась")
    val duck = Duck("Гусь")
    val seagull = Seagull("Чайка")

    crucianCarp.swim()
    duck.swim()
    duck.fly()
    seagull.fly()

}