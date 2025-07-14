class RecipeApp {}

class CategoryRecipe(
    var idCategory: Int,
    var nameCategory: String,
    var listOfRecipe: MutableList<Recipe>

) {}

class Recipe(
    val idRecipe: Int,
    val nameRecipe: String,
    var flagFavouriteRecipe: Boolean = false,
    var descriptionRecipe: String,
    var listOfIngridient: MutableList<Pair<Ingridient, Int>>

) {}

class Ingridient(
    val idIngridient: Int,
    val nameIngridient: String,
    val nameOfCount: String,

    )

fun main() {
    val sugar = Ingridient(1, "Сахар", "граммы")
    val beef = Ingridient(2, "Говядина", "граммы")
    val water = Ingridient(3, "Вода", "мл")
    val cheese = Ingridient(4, "Сыр", "ломтик")

    val recipe1 = Recipe(
        1, "Классический бургер", true,
        listOfIngridient = mutableListOf(
            sugar to 5,
            beef to 100,
            water to 33
        ),
        descriptionRecipe = "берем ингридиенты, готовим бургер"
    )
    val recipe2 = Recipe(
        1, "Чизбургер", true,
        listOfIngridient = mutableListOf(
            sugar to 50,
            beef to 200,
            water to 50,
            cheese to 2
        ),
        descriptionRecipe = "берем ингридиенты, готовим чизбургер"
    )
}


