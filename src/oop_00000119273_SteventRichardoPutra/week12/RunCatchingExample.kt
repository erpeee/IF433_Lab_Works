package oop_00000119273_SteventRichardoPutra.week12

fun main() {
    println("=== Test RunCatching ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}