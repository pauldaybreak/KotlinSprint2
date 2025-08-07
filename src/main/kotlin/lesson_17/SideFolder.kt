package lesson_17

class SideFolder(
    _name: String,
    _fileCount: Int,
    _isSecret: Boolean,
) {
    val name: String = _name
        get() = if (isSecret) "скрытая папка" else field


    val fileCount: Int = _fileCount
        get() = if (isSecret) 0 else field

    var isSecret: Boolean = _isSecret
        get() = field
        set(value: Boolean) {
            field = value

        }

    init {
        this.isSecret = _isSecret
    }

    fun printInfo() {
        println("${name}, ${this@SideFolder.fileCount}")
    }
}

fun main() {
    var folder1 = SideFolder("my private folder", 500, true)
    var folder2 = SideFolder("my  folder", 500, false)
    folder2.isSecret = true
    folder1.printInfo()
    folder2.printInfo()
}