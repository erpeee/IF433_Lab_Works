package oop_00000119273_SteventRichardoPutra.week10

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T){
        items.add(item)
    }
    fun getAll(): List<T> {
        return items
    }
    fun findByName(query: String): List<T> {
        return items.filter {
            it.toString().contains(query, ignoreCase = true)
        }
    }
}