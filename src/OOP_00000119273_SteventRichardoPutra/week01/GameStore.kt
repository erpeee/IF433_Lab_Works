package OOP_00000119273_SteventRichardoPutra.week01

fun main() {
    val gameTitle : String
    val price : Int = 500000

    val discountedPrice = calculateDiscount(price)

    printReceipt(gameTitle = "Plants", discountedPrice)
}

fun calculateDiscount(price: Int) : Int = if (price > 500000) price - 100000 else price - 50000

fun printReceipt(gameTitle: String, finalPrice: Int) {
    println("=====Receipt=====")
    println("Game : $gameTitle, Price : $finalPrice")
    println("=================")
}