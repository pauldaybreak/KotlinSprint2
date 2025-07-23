package lesson_14

open class ShipTask1(
    val name: String,
    val speed: Int = 100,
    val cargoLoad: Int = 100,
    val countLoadPassengers: Int = 1,
    val canBreakIce: Boolean = false,
) {
    open fun startEngine() {
        println("$name Запуск двигателя")
    }

    fun startNavigationSystem() {
        println("$name Запуск навигационной системы")
    }

    open fun serviceEngine() {
        println("$name Обслуживние двигателя")
    }
}

class CargoShipTask1(
    name: String,
    speed: Int,
    cargoLoad: Int,
    countLoadPassengers: Int,
    canBreakIce: Boolean,
    val securityWeaponOnShip: Boolean,
    val capacityDieselTank: Int,
) : ShipTask1(name, speed, cargoLoad, countLoadPassengers, canBreakIce) {
    fun loadCargo() {
        println("$name Загрузка грузом")
    }

    fun cleanHold() {
        println("$name Очистка трюма грузового корабля")
    }
}

class CruiseShipTask1(
    name: String,
    speed: Int,
    cargoLoad: Int,
    countLoadPassengers: Int,
    canBreakIce: Boolean,
    val countServicePersonal: Int,

    ) : ShipTask1(name, speed, cargoLoad, countLoadPassengers, canBreakIce) {
    fun boardingPassengers() {
        println("$name Посадка -  $countLoadPassengers пассажиров")
    }

    fun exitPassengers() {
        println("$name Высадка пассажиров")
    }
}

class IceBreakerShipTask1(
    name: String,
    speed: Int,
    cargoLoad: Int,
    countLoadPassengers: Int,
    canBreakIce: Boolean,
    val nuclearEngine: Boolean,
    val countDaysAutonomyWorking: Int,

    ) : ShipTask1(name, speed, cargoLoad, countLoadPassengers, canBreakIce) {

    override fun startEngine() {
        if (nuclearEngine == false) {
            println("$name - Запуск дизельного двигателя")
        } else println("$name - Запуск реактора")
    }

    override fun serviceEngine() = if (nuclearEngine == false) {
        println("$name - Обслуживание двигателя")
    } else println("$name - Обслуживание реактора")

    fun workExpiditionGroup() {
        println("на корабле $name работает экспидиция $countDaysAutonomyWorking дней")
    }

    fun breakIce() {
        println("$name колит толстый лёд, прокладывает путь")
    }

}

fun main() {
    val cargoShip1 = CargoShipTask1("Fortuna", 15, 20000, 30, false, true, 5000)
    val cruiseShip1 = CruiseShipTask1("Andatra", 25, 7500, 500, false, 50)
    val iceBreakerShip = IceBreakerShipTask1("Ledokolun", 10, 10000, 25, true, true, 100)
    val iceBreakerShip2 = IceBreakerShipTask1("ДизельСила", 7, 7500, 23, false, false, 50)

    cargoShip1.loadCargo()
    cargoShip1.startEngine()
    cargoShip1.startNavigationSystem()

    cruiseShip1.startEngine()
    cruiseShip1.boardingPassengers()
    cruiseShip1.startNavigationSystem()
    cruiseShip1.exitPassengers()

    iceBreakerShip.startNavigationSystem()
    iceBreakerShip.workExpiditionGroup()
    iceBreakerShip.serviceEngine()
    iceBreakerShip.breakIce()

    iceBreakerShip2.startNavigationSystem()
    iceBreakerShip2.workExpiditionGroup()
    iceBreakerShip2.serviceEngine()
    iceBreakerShip2.breakIce()
}