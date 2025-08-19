package lesson_21

class Player(
    val name: String,
    var currentHealth: Int,
    val maxHealthy: Int = 100,
)

fun Player.isHealthy(): Boolean{
    return this.currentHealth == maxHealthy
}

fun Player.plusCurrentHealth() {
    this.currentHealth = maxHealthy
}

fun main(){
    var player1 = Player("Max Payne", 70,)
    println(player1.isHealthy())
    player1.plusCurrentHealth()
    println(player1.isHealthy())
}