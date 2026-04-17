package oop_00000119273_SteventRichardoPutra.week01

fun calculateDiscount(price: Int) : Int = if (price > 500000) price - (price * 20/100) else price - (price * 10/100)

fun printReceipt(gameTitle: String, finalPrice: Int, note: String?) {
    println("=====Receipt=====")
    println("Game : $gameTitle")
    println("Price : $finalPrice")
    val displayNote = note ?: "Tidak ada catatan"
    println("Note : $displayNote")

    println("=================")
}
fun main() {
    val gameTitle : String
    val price : Int = 500000
    val userNote: String? = null

    val discountedPrice = calculateDiscount(price)

    printReceipt(gameTitle = "Plants", discountedPrice, userNote)
}

