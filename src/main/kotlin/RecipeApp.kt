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
    var listOfIngridient: MutableList<Triple<String, Int, String>>

) {}

fun main() {
    val recipe1 = Recipe(
        1, "Классический бургер", true,
        listOfIngridient = mutableListOf(
            Triple("Булка", 1, "штука"),
            Triple("Котлета", 1, "штука"),
            Triple("Сыр", 40, "грамм")
        ),
        descriptionRecipe = "берем ингридиенты, готовим бургер"
    )
    val recipe2 = Recipe(
        1, "Чизбургер", true,
        listOfIngridient = mutableListOf(
            Triple("Булка", 1, "штука"),
            Triple("Курица", 1, "штука"),
            Triple("Петрушка", 40, "грамм")
        ),
        descriptionRecipe = "берем ингридиенты, готовим чизбургер"
    )
}


