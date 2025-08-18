package lesson_19

class SpaceShip(val name: String) {
    fun takeOff() {
        println("Взлёт")
    }

    fun land() {
        // TODO("здесь требуется описать логику приземления")
    }

    fun shootAsteroid() {
        TODO("логика стрельбы по астероидам.")
    }
}

fun main() {
    val ship1 = SpaceShip("Fortuna")
    ship1.takeOff()
    ship1.land()
    ship1.shootAsteroid()
}