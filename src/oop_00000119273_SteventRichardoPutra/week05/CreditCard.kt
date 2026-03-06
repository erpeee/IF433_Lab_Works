package oop_00000119273_SteventRichardoPutra.week05

class CreditCard(accountName: String, val limit: Double): PaymentMethod(accountName) {
    var usedAmount: Double = 0.0
    override fun processPayment(amount: Double) {
        if(usedAmount + amount <= limit){
            usedAmount += amount
            println("[$accountName - Credit Card] Sukses! Transaksi sebesar Rp$amount diterima. Sisa limit: Rp${limit - usedAmount}")
        }else {
            println("[$accountName - Credit Card] Transaksi ditolak: Melebihi Limit.")
        }
    }
}