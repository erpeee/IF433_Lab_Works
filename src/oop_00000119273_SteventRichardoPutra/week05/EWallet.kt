package oop_00000119273_SteventRichardoPutra.week05

class EWallet(var balance: Double) : PaymentMethod(accountName)  {
    override fun processPayment(amount: Double) {
        if(balance >= amount){
            balance -= amount
            println("[$accountName - E-Wallet] Sukses! Pembayaran Rp$amount berhasil. Saldo sekarang: Rp$balance")
        } else{
            println("[$accountName - E-Wallet] Transaksi Gagal : Saldo anda tidak cukup.")
        }
        fun topUp(amount:Double){
            balance += amount
            println("[$accountNam - E-Wallet] Top Up berhasil!, Saldo sekarang: Rp$balance")
        }
    }
}