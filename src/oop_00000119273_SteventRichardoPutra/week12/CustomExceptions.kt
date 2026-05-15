package oop_00000119273_SteventRichardoPutra.week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attemped $amount, balance: $balance")