package oop_00000119273_SteventRichardoPutra.week05

abstract class PaymentMethod(val accountName: String){
    abstract fun processPayment(amount: Double)
}