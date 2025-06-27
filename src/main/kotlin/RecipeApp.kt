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
        var descriptionRecipe: String

        ) {}

    class Ingridient(
        val ingridientsForRecipe : Recipe,
        var listOfIngridient: MutableList<Triple<String, Int ,String>>
        ) {}


    fun main() {
        val recipe1 = Recipe(1, "Классический бургер", true, "берем ингридиенты, готовим бургер")
        val recipe2 = Recipe(2, "Чизбургер", false, "берем ингридиенты, готовим чизбургер")
        var category1 = CategoryRecipe(
            1, "Бургеры",
            listOfRecipe = mutableListOf(recipe1, recipe2))

        var listIngridientsForRecipe1 = Ingridient(
            ingridientsForRecipe = recipe1,
            listOfIngridient = mutableListOf(
            Triple("Булка", 1, "штука"),
            Triple("Котлета", 1, "штука"),
            Triple("Сыр", 40, "грамм")
        )
        )



    }


