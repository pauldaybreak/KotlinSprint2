package lesson_14

fun main(){
    val cargoShip1 = CargoShip("Fortuna", 15, 20000, 30, false, true, 5000)
    val cruiseShip1 = CruiseShip("Andatra", 25, 7500, 500, false, 50)
    val iceBreakerShip = IceBreakerShip("Ledokolun", 10, 10000, 25, true, true, 100)
    val iceBreakerShip2 = IceBreakerShip("ДизельСила", 7, 7500, 23, false, false, 50)

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