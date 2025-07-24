package lesson_15


interface SwimmableAnimalTask1 {
    fun swimming()
    fun fastSwimmingBoost()
    fun eats()
}

interface FlyableAnimal {
    fun fly() {}
    fun run() {}
    fun say() {}
    fun huntingFish() {}
}

class Fish(
    val name: String,
) : SwimmableAnimalTask1 {
    override fun swimming() {
        println("$name, плывёт")
    }

    override fun fastSwimmingBoost() {
        println("$name, плывёт с ускорением")
    }

    override fun eats() {
        println("$name, ест")
    }
}

class Seagull(
    val name: String,
) : FlyableAnimal {
    override fun fly() {
        println("$name, летит")
    }

    override fun huntingFish() {
        println("$name, охотится")
    }
}

class Goose(
    val name: String,
) : FlyableAnimal {
    override fun run() {
        println("$name, бежит")
    }
}

fun main() {
    val crucianCarp = Fish("Карась")
    val goose = Goose("Гусь")
    val seagull = Seagull("Чайка")

    crucianCarp.swimming()
    goose.run()
    seagull.fly()

}