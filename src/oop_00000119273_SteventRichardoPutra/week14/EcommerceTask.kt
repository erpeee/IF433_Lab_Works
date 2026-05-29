package oop_00000119273_SteventRichardoPutra.week14

import java.io.File

class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }
        println("Memproses pesanan $itemName seharga $finalPrice")

        file.appendText("$itemName, $finalPrice, $customerType\n")
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface OrderRepository {
    fun saveOrder(itemName: String, finalPrice: Double, customerType: String)
}

class CsvOrderRepository : OrderRepository {
    private val file = File("orders.csv")

    override fun saveOrder(itemName: String, finalPrice: Double, customerType: String) {
        file.writer(append = true).use { writer ->
            writer.write("$itemName, $finalPrice, $customerType\n")
        }
    }
}

interface NotificationService {
    fun sendNotification(itemName: String)
}

class EmailNotifier : NotificationService {
    override fun sendNotification(itemName: String) {
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface PricingStrategy {
    val name: String
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {
    override val name: String = "REGULAR"
    override fun calculate(price: Double): Double = price
}

class VipPricing : PricingStrategy {
    override val name: String = "VIP"
    override fun calculate(price: Double): Double = price * 0.90
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {
    fun processOrder(itemName: String, basePrice: Double, pricingStrategy: PricingStrategy) {
        val finalPrice = pricingStrategy.calculate(basePrice)
        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder(itemName, finalPrice, pricingStrategy.name)
        notifier.sendNotification(itemName)
    }
}

fun main() {
    val repo = CsvOrderRepository()
    val notifier = EmailNotifier()
    val orderProcessor = SafeOrderProcessor(repo, notifier)

    orderProcessor.processOrder("Laptop Gaming", 1500000.0, RegularPricing())
    orderProcessor.processOrder("Smartphone Flagship", 10000000.0, VipPricing())
}