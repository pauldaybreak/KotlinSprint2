package lesson_14

open class SpaceObject(
    val idSpaceBody: Int,
    val nameSpaceBody: String,
    val atmosphere: Boolean,
    val friendlyForLanding: Boolean,
) {}

class Planet(
    idSpaceBody: Int,
    nameSpaceBody: String,
    atmosphere: Boolean,
    friendlyForLanding: Boolean,
    val listOfSputnik: List<Sputnik>?,
) : SpaceObject(idSpaceBody, nameSpaceBody, atmosphere, friendlyForLanding) {}

class Sputnik(
    idSpaceBody: Int,
    nameSpaceBody: String,
    atmosphere: Boolean,
    friendlyForLanding: Boolean,
) : SpaceObject(idSpaceBody, nameSpaceBody, atmosphere, friendlyForLanding) {}

fun main() {

    val moon = Sputnik(1, "Луна", false, true)
    val triton = Sputnik(2, "Тритон", false, true)

    val mercury = Planet(1, "Mercury", false, false, null)
    val earth = Planet(
        2, "Земля", true, true,
        listOfSputnik = listOf(
            moon,
            triton
        )
    )
    println("Планета - ${earth.nameSpaceBody}\nСпутники планеты - ${earth.listOfSputnik?.joinToString(", ") { it.nameSpaceBody }}")
}