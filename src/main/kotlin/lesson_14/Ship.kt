package lesson_14

open class Ship (
    val name: String,
    val speed: Int = 100,
    val cargoLoad: Int = 100,
    val countLoadPassengers: Int = 1,
    val canBreakIce: Boolean = false,
){
    open fun startEngine(){
        println("$name Запуск двигателя")
    }
    fun startNavigationSystem(){
        println("$name Запуск навигационной системы")
    }

    open fun serviceEngine(){
        println("$name Обслуживние двигателя")
    }

}