package lesson_14

class CruiseShipT2T2(
    name: String,
    speed: Int,
    cargoLoad: Int,
    countLoadPassengers: Int,
    canBreakIce: Boolean,
    val countServicePersonal: Int,

    ) : ShipT2(name, speed, cargoLoad, countLoadPassengers, canBreakIce) {
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