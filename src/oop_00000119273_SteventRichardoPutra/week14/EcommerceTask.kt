package oop_00000119273_SteventRichardoPutra.week14

import java.io.File

class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, cusutomerType: String) {
        val finalPrice = when (customerType) {
            "REGULAR" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }
        println("Memproses pesanan $itemName seharga $finalPrice")

        file.appendText("$itemName, $finalPrice, $cusutomerType\n")
        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }

}