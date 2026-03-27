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

    println("\n=== Test Data Class===")
    val data1= DataUser("Jack", 28)
    val data2= DataUser("Jack", 28)
    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")
    val(userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== Test Sealed Class ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditarik!")

    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
    }
}