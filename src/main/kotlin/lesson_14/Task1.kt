package lesson_14

fun main(){
    val cargoShip1 = CargoShip("Fortuna", 10, true, 10000)
    val cruiseShip1 = CruiseShip("Andatra", 25, true, 500, 35)
    val iceBreakerShip = IceBreakerShip("Ledokolun", 20, false, true, 100)
    val iceBreakerShip2 = IceBreakerShip("ДизельСила", 20, false, false, 100)

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

    iceBreakerShip2.startNavigationSystem()
    iceBreakerShip2.workExpiditionGroup()
    iceBreakerShip2.serviceEngine()
}