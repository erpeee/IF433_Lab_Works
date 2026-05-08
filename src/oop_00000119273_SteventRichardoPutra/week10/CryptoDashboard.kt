package oop_00000119273_SteventRichardoPutra.week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("Bitcoin", 65000.0))
    coinRepo.add(Coin("DOGE",1.04))
    coinRepo.add(Coin("Etherium", 4000.0))

}