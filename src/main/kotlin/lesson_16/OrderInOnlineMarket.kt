package lesson_16

class OrderInOnlineMarket(
    private val id: Int,
    private var status: String,
) {
    fun changeStatusByManager(changedStatus: String) {
        this.status = changedStatus
    }

    fun printInfo() {
        println("${id}, ${status}")
    }
}

fun callToManager(wishUserStatus: String, bid: OrderInOnlineMarket) {
    bid.changeStatusByManager(wishUserStatus)
}

fun main() {
    var order1 = OrderInOnlineMarket(1, "запустить сборку заказа")
    order1.printInfo()
    callToManager("приостановить", order1)
    order1.printInfo()

    val order2 = OrderInOnlineMarket(2, "оплата заказа")
    order2.printInfo()
    callToManager("запустить сборку заказа", order2)
    order2.printInfo()

}