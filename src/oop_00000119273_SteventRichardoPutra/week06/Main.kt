package oop_00000119273_SteventRichardoPutra.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("->Memulai checkout...")
    method.pay(amount)
}

fun main(){
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1= Gopay()
    val pay2= CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(pay1, 50000.0)
    processCheckout(pay2, 150000.0)

    println("\n--- Smart Device Testing---")
    val myHub = SmartHomeHub
    val myLamp = SmartLamp("L-001", "Ruang Tamu")
    val mySpeaker = SmartSpeaker("S-002", "Google Nest Dapur")
    val myCCTV = SmartCCTV("C-003","Ezviz Garasi")
}
