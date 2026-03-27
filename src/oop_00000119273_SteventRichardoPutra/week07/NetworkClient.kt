package oop_00000119273_SteventRichardoPutra.week07

class NetworkClient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url")
    }
}