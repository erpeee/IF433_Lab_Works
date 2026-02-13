package oop_00000119273_SteventRichardoPutra.week01

fun main() {
    val gameTitle : String
    val price : Int = 500000
    val userNote: String? = null

    val discountedPrice = calculateDiscount(price)

    printReceipt(gameTitle = "Plants", discountedPrice, userNote)
}

fun calculateDiscount(price: Int) : Int = if (price > 500000) price - 100000 else price - 50000

fun printReceipt(gameTitle: String, finalPrice: Int, note: String?) {
    println("=====Receipt=====")
    println("Game : $gameTitle")
    println("Price : $finalPrice")
    val displayNote = note ?: "Tidak ada catatan"
    println("Note : $displayNote")

    println("=================")
}