package lesson_14

open class Ship (
    val name: String,
    val middleSpeed: Int,
    val securityWeaponOnShip: Boolean = false
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