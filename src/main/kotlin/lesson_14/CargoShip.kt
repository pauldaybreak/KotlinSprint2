package lesson_14

class CargoShip(
    name: String,
    middleSpeed: Int,
    securityWeaponOnShip: Boolean,
    var capacityDieselTank: Int,
) : Ship(name, middleSpeed, securityWeaponOnShip) {
    fun loadCargo() {
        println("$name Загрузка грузом")
    }

    fun cleanHold() {
        println("$name Очистка трюма грузового корабля")
    }

}