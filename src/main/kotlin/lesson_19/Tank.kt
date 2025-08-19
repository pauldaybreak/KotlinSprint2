package lesson_19

class Tank(
    var typeAmmunition: Ammunition? = null,
) {

    fun loadNewTypeAmmunition(ammo: Ammunition) {
        this.typeAmmunition = ammo
    }

    fun shoot() {
        when (val ammo = typeAmmunition) {
            Ammunition.BLUE -> println("Выстрел ${ammo.descriptionColorTypeAmmo} - нанесен урон ${ammo.scoreDamage}")
            Ammunition.GREEN -> println("Выстрел ${ammo.descriptionColorTypeAmmo} - нанесен урон ${ammo.scoreDamage}")
            Ammunition.RED -> println("Выстрел ${ammo.descriptionColorTypeAmmo} - нанесен урон ${ammo.scoreDamage}")
            else -> println("нет патронов")
        }
    }
}

enum class Ammunition(
    val descriptionColorTypeAmmo: String,
    val scoreDamage: Int,
) {
    BLUE("Синий снаряд", 5),
    GREEN("Зелёный снаряд", 10),
    RED("Красный снаряд", 20),
}

fun main() {
    var tank1 = Tank()
    tank1.shoot()
    tank1.loadNewTypeAmmunition(Ammunition.BLUE)
    tank1.shoot()
    tank1.loadNewTypeAmmunition(Ammunition.GREEN)
    tank1.shoot()
    tank1.loadNewTypeAmmunition(Ammunition.RED)
    tank1.shoot()
    tank1.loadNewTypeAmmunition(Ammunition.BLUE)
    tank1.shoot()
}
