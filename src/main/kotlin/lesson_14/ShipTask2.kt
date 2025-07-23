package lesson_14

open class ShipTask2(
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

    fun printInfoAboutShip() {
        println(
            "* Название - $name\n* Скорость - $speed узлов\n* Грузоподъемность - $cargoLoad тонн\n" +
                    "* Вместимость экипажа - $countLoadPassengers\n* Может идти по льду - $canBreakIce"
        )
    }
}

class CargoShipTask2(
    name: String,
    speed: Int,
    cargoLoad: Int,
    countLoadPassengers: Int,
    canBreakIce: Boolean,
    val securityWeaponOnShip: Boolean,
    val capacityDieselTank: Int,
) : ShipTask2(name, speed, cargoLoad, countLoadPassengers, canBreakIce) {
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

class CruiseShipTask2(
    name: String,
    speed: Int,
    cargoLoad: Int,
    countLoadPassengers: Int,
    canBreakIce: Boolean,
    val countServicePersonal: Int,

    ) : ShipTask2(name, speed, cargoLoad, countLoadPassengers, canBreakIce) {
    fun boardingPassengers() {
        println("$name Посадка -  $countLoadPassengers пассажиров")
    }

    fun exitPassengers() {
        println("$name Высадка пассажиров")
    }

    fun openHorizontalTrapFromShkafoot() {
        println("$name выдвигает горизонтальный трап со шкафута")
    }

}

class IceBreakerShipTask2(
    name: String,
    speed: Int,
    cargoLoad: Int,
    countLoadPassengers: Int,
    canBreakIce: Boolean,
    val nuclearEngine: Boolean,
    val countDaysAutonomyWorking: Int,

    ) : ShipTask2(name, speed, cargoLoad, countLoadPassengers, canBreakIce) {

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

    fun openGateFromStern() {
        println("$name открывает ворота со стороны кормы")
    }
}

fun main() {
    val cargoShipT21 = CargoShipTask2("Fortuna", 15, 20000, 30, false, true, 5000)
    val cruiseShipT21 = CruiseShipTask2("Andatra", 25, 7500, 500, false, 50)
    val iceBreakerShipT2 = IceBreakerShipTask2("Ledokolun", 10, 10000, 25, true, true, 100)
    val iceBreakerShipT22 = IceBreakerShipTask2("ДизельСила", 7, 7500, 23, false, false, 50)

    cargoShipT21.loadCargo()
    cargoShipT21.startEngine()
    cargoShipT21.startNavigationSystem()
    cargoShipT21.activateCargoLift()
    cargoShipT21.printInfoAboutShip()

    cruiseShipT21.startEngine()
    cruiseShipT21.boardingPassengers()
    cruiseShipT21.startNavigationSystem()
    cruiseShipT21.exitPassengers()
    cruiseShipT21.openHorizontalTrapFromShkafoot()
    cruiseShipT21.printInfoAboutShip()

    iceBreakerShipT2.startNavigationSystem()
    iceBreakerShipT2.workExpiditionGroup()
    iceBreakerShipT2.serviceEngine()
    iceBreakerShipT2.breakIce()
    iceBreakerShipT2.openGateFromStern()
    iceBreakerShipT2.printInfoAboutShip()

    iceBreakerShipT22.startNavigationSystem()
    iceBreakerShipT22.workExpiditionGroup()
    iceBreakerShipT22.serviceEngine()
    iceBreakerShipT22.breakIce()
    iceBreakerShipT22.openGateFromStern()
    iceBreakerShipT22.printInfoAboutShip()

}