package lesson_17

class Parcel(val id: Int, _geoPosition: String,) {
    private var changeLocationcounter: Int = 0
    var geoPosition = _geoPosition
        get() = field
        set(value: String) {
            if (field != value) {
                changeLocationcounter++
                field = value
            }
        }
    fun printInfo() {
        println("ID посылки: ${id}, Текущее местоположение: $geoPosition, Счётчик местоположений: $changeLocationcounter")
    }
}

fun main() {
    var parcel1 = Parcel(1, "Abacan")
    parcel1.geoPosition = "Sergiev Posad"
    parcel1.geoPosition = "Suzdal"
    parcel1.geoPosition = "Berlin"
    parcel1.printInfo()
}