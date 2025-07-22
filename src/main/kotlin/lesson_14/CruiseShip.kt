package lesson_14

class CruiseShip (
    name: String,
    middleSpeed: Int,
    securityWeaponOnShip: Boolean,
    val capacityPassenger: Int,
    val countServicePersonal: Int,

    ): Ship(name, middleSpeed, securityWeaponOnShip){
    fun boardingPassengers(){
        println("$name Посадка -  $capacityPassenger пассажиров")
    }

    fun exitPassengers(){
        println("$name Высадка пассажиров")
    }

}