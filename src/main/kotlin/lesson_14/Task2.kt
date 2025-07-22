package lesson_14

fun main() {
    val cargoShipT21 = CargoShipT2T2("Fortuna", 15, 20000, 30, false, true, 5000)
    val cruiseShipT21 = CruiseShipT2T2("Andatra", 25, 7500, 500, false, 50)
    val iceBreakerShipT2 = IceBreakerShipT2T2("Ledokolun", 10, 10000, 25, true, true, 100)
    val iceBreakerShipT22 = IceBreakerShipT2T2("ДизельСила", 7, 7500, 23, false, false, 50)

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