package oop_00000119273_SteventRichardoPutra.week07

fun main(){
    println("=== Test Singleton ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== Test Companion Object ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== Test Regular Class===")
    val reg1= RegularUser("Jack", 28)
    val reg2= RegularUser("Jack", 28)
    println(reg1)
    println("Sama? ${reg1 == reg2}")
}