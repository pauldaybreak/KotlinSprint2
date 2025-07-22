package lesson_14

class CruiseShip (
    name: String,
    speed: Int,
    cargoLoad: Int,
    countLoadPassengers: Int,
    canBreakIce: Boolean,
    val countServicePersonal: Int,

    ): Ship(name, speed, cargoLoad, countLoadPassengers, canBreakIce) {
    fun boardingPassengers(){
        println("$name Посадка -  $countLoadPassengers пассажиров")
    }

    fun exitPassengers(){
        println("$name Высадка пассажиров")
    }

}