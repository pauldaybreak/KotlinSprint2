package lesson_15

abstract class WeatherStationStats(val idRecordWeather: Int, val dateRegisterWeather: String)

class Temperature(
    idRecordWeather: Int, dateRegisterWeather: String, val temperature: Int
) :
    WeatherStationStats(idRecordWeather, dateRegisterWeather)

class PrecipitationAmount(
    idRecordWeather: Int, dateRegisterWeather: String, val rainyQuantity: Int
) :
    WeatherStationStats(idRecordWeather, dateRegisterWeather)

class WeatherServer(val nameServer: String, val idmessage: Int) {
    fun sendInfoOfWeather(info: WeatherStationStats) {
        when (info) {
            is Temperature -> (println("сообщение {$idmessage}, на сервер ${nameServer}, передана температура: ${info.temperature}"))
            is PrecipitationAmount -> (println("сообщение {$idmessage}, на сервер ${nameServer}, переданы количество осадков: ${info.rainyQuantity} милиметров"))
            else -> println("Некорректные данные, ожидание от метеостанции")
        }
    }
}

fun main() {
    val temp1 = Temperature(1, "01.01.2001", 18)
    val rain1 = PrecipitationAmount(2, "02.01.2001", 260)
    val message1 = WeatherServer("meteo.su", 1)
    val message2 = WeatherServer("meteo.su", 2)
    message1.sendInfoOfWeather(temp1)
    message2.sendInfoOfWeather(rain1)

}


