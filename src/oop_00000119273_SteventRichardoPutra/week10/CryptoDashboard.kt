package oop_00000119273_SteventRichardoPutra.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("Bitcoin", 65000.0))
    coinRepo.add(Coin("DOGE",1.04))
    coinRepo.add(Coin("Etherium", 4000.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("Status: ${response.status}")
    response.data.forEach { coin ->
        println("Coin Name: ${coin.name}")
    }

    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.05))
    txRepo.add(Transaction("TX002", 1.04))

    println("Transaction: ${txRepo.getAll().size}")
    txRepo.getAll().forEach { tx ->
        println("Transaction: ${tx.id}, ${tx.amount} USD")
    }
}