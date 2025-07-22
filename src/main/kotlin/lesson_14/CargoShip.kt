package lesson_14

class CargoShip(
    name: String,
    speed: Int,
    cargoLoad: Int,
    countLoadPassengers: Int,
    canBreakIce: Boolean,
    val securityWeaponOnShip: Boolean,
    val capacityDieselTank: Int,
) : Ship(name, speed, cargoLoad, countLoadPassengers, canBreakIce) {
    fun loadCargo() {
        println("$name Загрузка грузом")
    }

    fun cleanHold() {
        println("$name Очистка трюма грузового корабля")
    }

}