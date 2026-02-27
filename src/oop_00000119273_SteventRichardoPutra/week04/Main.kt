package oop_00000119273_SteventRichardoPutra.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle ("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car ("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing Electric Car ---")
    val mobilListrik = ElectricCar("BYD", 2, 100)
    mobilListrik.openTrunk()
    mobilListrik.honk()
    mobilListrik.accelerate()

    println("--- Tugas Mandiri ---")
    val myManager = Manager("Udin", 5000000)
    println("Manager ${myManager.name} di gaji dengan Rp. ${myManager.baseSalary}, mendapatkan bonus Rp. ${myManager.calculateBonus()}")
    myManager.work()
    val myDeveloper = Developer("Budi", 10000000, "Python")
    println("${myDeveloper.name} bekerja dan digaji Rp. ${myDeveloper.baseSalary}. Bonus nya adalah Rp. ${myDeveloper.calculateBonus()}")
    myDeveloper.work()

}
