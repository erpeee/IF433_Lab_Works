package oop_00000119273_SteventRichardoPutra.week11

fun main() {
    println("=== Test Extension Functions ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")
}