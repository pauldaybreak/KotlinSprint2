package lesson_14

class CargoShipT2T2(
    name: String,
    speed: Int,
    cargoLoad: Int,
    countLoadPassengers: Int,
    canBreakIce: Boolean,
    val securityWeaponOnShip: Boolean,
    val capacityDieselTank: Int,
) : ShipT2(name, speed, cargoLoad, countLoadPassengers, canBreakIce) {
    fun loadCargo() {
        println("$name Загрузка грузом")
    }

    fun cleanHold() {
        println("$name Очистка трюма грузового корабля")
    }

    fun activateCargoLift() {
        println("$name - работа погрузочного крана")
    }
}