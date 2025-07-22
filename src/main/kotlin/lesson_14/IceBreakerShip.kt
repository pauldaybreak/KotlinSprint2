package lesson_14

class IceBreakerShip(
    name: String,
    middleSpeed: Int,
    securityWeaponOnShip: Boolean,
    var nuclearEngine: Boolean,
    var countDaysAutonomyWorking: Int,

    ) : Ship(name, middleSpeed, securityWeaponOnShip) {

    override fun startEngine(){
        if (nuclearEngine == false){
            println("$name - Запуск дизельного двигателя")
        } else println("$name - Запуск реактора")
    }

    override fun serviceEngine() = if (nuclearEngine == false) {
        println("$name - Обслуживание двигателя")
    } else println("$name - Обслуживание реактора")

    fun workExpiditionGroup() {
        println("на корабле $name работает экспидиция $countDaysAutonomyWorking дней")
    }


}