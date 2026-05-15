package oop_00000119273_SteventRichardoPutra.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attemped $amount, balance: $balance")

class BankAccount(var balance: Double) {
    fun withdraw(amount: Double) {
        if (amount < 0) {
            throw InsufficientFundsException("Amount must be positive")
        }
        if (amount > balance){
            throw InsufficientFundsException(amount, balance)
        }
        balance -= amount
        println("Withdrawal successful. Remaining balance: $balance")
    }
}