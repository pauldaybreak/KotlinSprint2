package lesson_17

class SideFolder(
    name: String,
    quantityFolder: Int,
    secretFlag: Boolean,
) {
    var name: String = name
        get() = field

    var quantityFolder: Int = quantityFolder
        get() = field

    var secretFlag: Boolean = secretFlag
        get() = field
        set(value: Boolean) {
            field = value
            if (value) {
                name = "скрытая папка"
                quantityFolder = 0
            }
        }

    init {
        this.secretFlag = secretFlag
    }

    fun printInfo() {
        println("${name}, ${quantityFolder}")
    }
}

fun main() {
    var folder1 = SideFolder("my private folder", 500, true)
    var folder2 = SideFolder("my  folder", 500, false)
    folder2.secretFlag = true
    folder1.printInfo()
    folder2.printInfo()
}