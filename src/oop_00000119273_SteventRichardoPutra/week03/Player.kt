package oop_00000119273_SteventRichardoPutra.week03

class Player(username: String){
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

