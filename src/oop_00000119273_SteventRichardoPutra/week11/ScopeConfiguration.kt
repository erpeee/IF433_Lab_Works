package oop_00000119273_SteventRichardoPutra.week11

data class User(var name: String = "", var age: Int = 0)

fun main() {
    println("=== Test Apply ===")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)
}