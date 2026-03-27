package oop_00000119273_SteventRichardoPutra.week07

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to server"
        println("Database is ready.")
    }
}