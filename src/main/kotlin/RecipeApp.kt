import kotlin.io.path.Path

class RecipeApp {}

    class CategoryRecipe(
        var idCategory: Int,
        var nameCategory: String,

        ) {}

    class Food(
        val idRecipe: Int,
        val nameFood: String,
        var flagFavouriteFood: Boolean = false,
        var foodOfCategory: CategoryRecipe,

        ) {}

    class Ingridient(
        val idIngridient: Int,
        val nameIngridient: String,

        ) {}

    class MethodForFood(
        val idMethod: Int,
        val methodForFood: Food,
        var NameAndCountIngridientForFood: MutableList<Triple<Ingridient, Int, String>>, //название и поличество продуктов
        val descriptionMethod: String,
    )

    fun main() {
        val burgersCategory = CategoryRecipe(1, "Бургеры")
        val desertsCategory = CategoryRecipe(2, "Десерты")
        val pizzaCategory = CategoryRecipe(3, "Пицца")
        val fishCategory = CategoryRecipe(4, "Рыба")

        val chizburger = Food(1, "Чизбургер", false, burgersCategory)
        val classicalHamburger = Food(2, "Классический гамбургер", true, burgersCategory)

        val beefPatty = Ingridient(1, "Говяжья котлета")
        val hamburgerBun = Ingridient(2, "Булочка для гамбургера")
        val cheese = Ingridient(3, "Сыр")

        val ingridentsForClassicalBurger = mutableListOf( // список для клас. бургера
            Triple(beefPatty, 1, "шт"),
            Triple(hamburgerBun, 2, "шт"),
            Triple(cheese, 40, " гр")
        )

        val methodClassicalHamburger = MethodForFood(
            1, classicalHamburger, ingridentsForClassicalBurger,
            "берём ингридиенты и готовим бургер",
        )
        println(
            "${methodClassicalHamburger.idMethod} \n" +
                    "${methodClassicalHamburger.methodForFood.nameFood}\n" +
                    "--- ${ingridentsForClassicalBurger.joinToString{ "${it.first.nameIngridient}       ${it.second} ${it.third}"}}\n" +
                    "--- ${methodClassicalHamburger.descriptionMethod}")

    }


