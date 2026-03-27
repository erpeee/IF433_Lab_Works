package oop_00000119273_SteventRichardoPutra.week07

object GameManager{
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning){
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
        } else {
            isGameRunning = true
            println("Game sudah berjalan!")
        }
    }

}