package oop_00000119273_SteventRichardoPutra.week09

fun main(){
    println("=== Test List ===")

    val frameworks: List<String> = listOf("Kotlin", "Java", "C++")
    println("Immutable List: $frameworks")

    val scores: MutableList<Int> = mutableListOf(85, 90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")
}