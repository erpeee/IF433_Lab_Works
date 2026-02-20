package oop_00000119273_SteventRichardoPutra.week03

class Player(val username: String){
    private var xp: Int = 0

    val level: Int
    get() = (xp / 100) + 1

    fun addXp(amount: Int){
        if(amount > 0){
            val levelBefore = level

            xp += amount
            if(level > levelBefore) {
                println("Level Up! Selamat $username naik ke level $level")
            }
        } else {
            println("Amount harus positif!")
        }
    }
}

fun main() {
    val player = Player("Stevent")

    println("--- Menambah 50 XP ---")
    player.addXp(50)
    println("Current Level: ${player.level}")

    println("\n--- Menambah 60 XP ---")
    player.addXp(60)

    println("Current Level: ${player.level}")
}