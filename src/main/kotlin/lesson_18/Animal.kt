package lesson_18

open class Animal(open val name: String, open val food: String) {
    open fun eat() {
        println("$name -> ест $food")
    }

    open fun sleep() {
        println("$name -> спит")
    }
}

class Fox(override val name: String, override val food: String = "ягоды") : Animal(name, food) {
    override fun eat() {
        println("$name -> ест $food")
    }
}

class Dog(override val name: String, override val food: String) : Animal(name, food)
class Cat(override val name: String, override val food: String) : Animal(name, food)

fun main() {
    val animal1 = Fox("Лиса")
    val animal2 = Dog("Собака", "кости")
    val animal3 = Cat("Кот", "рыбу")
    val listOfAnimals = listOf<Animal>(animal1, animal2, animal3)
    for (animal in listOfAnimals) {
        animal.eat()
    }
}
