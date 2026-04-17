package oop_00000119273_SteventRichardoPutra.week08

fun Main {
    println("=== Test Safe Calls & Elvis ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota Tidak Diketahui"
    println("Tujuan pengiriman: $destination")
}