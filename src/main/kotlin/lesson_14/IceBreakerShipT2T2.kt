package lesson_14

class IceBreakerShipT2T2(
    name: String,
    speed: Int,
    cargoLoad: Int,
    countLoadPassengers: Int,
    canBreakIce: Boolean,
    val nuclearEngine: Boolean,
    val countDaysAutonomyWorking: Int,

    ) : ShipT2(name, speed, cargoLoad, countLoadPassengers, canBreakIce) {

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