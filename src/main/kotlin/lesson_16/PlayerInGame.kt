package lesson_16

class PlayerInGame(
    val name: String,
    private var health: Int,
    private var powerOfDamage: Int,
) {

    private fun takeDamage(damage: Int) {
        health = health - damage
        println("$name получил урон $damage - здоровье $health")
        if (health <= 0) {
            die()
        }
    }

    private fun die() {
        powerOfDamage = 0
        println("для игрока $name игра окончена, он мёртв")
    }

    fun healing(scoreHealing: Int) {
        if (this.health <= 0) {
            println("игрок ${this.name} не может излечится он мёртв")
        } else {
            this.health += scoreHealing
            println("игрок ${this.name} получил + $scoreHealing. Общее здоровье ${this.name} = ${this.health}")
        }
    }

    fun attack(attackedPlayer: PlayerInGame) {
        if (attackedPlayer.health <= 0) {
            attackedPlayer.powerOfDamage = 0
            println("${attackedPlayer.name} мёртв.")
        } else {
            println("${this.name} - ${this.health} атакует: ${attackedPlayer.name} - ${attackedPlayer.health}")
            attackedPlayer.takeDamage(this.powerOfDamage)
        }
    }
}

fun main() {
    var player1 = PlayerInGame("Gendalf", 100, 25)
    var player2 = PlayerInGame("Sauron", 100, 25)
    player1.attack(player2)
    player1.attack(player2)
    player1.attack(player2)
    player2.attack(player1)
    player2.healing(25)
    player1.attack(player2)
    player1.attack(player2)
    player2.healing(25)


}