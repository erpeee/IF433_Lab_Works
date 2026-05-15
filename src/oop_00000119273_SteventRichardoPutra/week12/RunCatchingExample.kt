package oop_00000119273_SteventRichardoPutra.week12

fun main() {
    println("=== Test RunCatching ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Valule: $recovered")
}