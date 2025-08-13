package lesson_19

enum class FishInAquarium(val description: String) {
    GUPPY("Гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок")
}

fun main() {
    println("Вы можете добавить в свой аквариум следующих рыбок:")
    for (i in FishInAquarium.entries) {
        println(i.description.replaceFirstChar { it.uppercase() })
    }
}
