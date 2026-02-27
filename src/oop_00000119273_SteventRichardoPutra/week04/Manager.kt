package oop_00000119273_SteventRichardoPutra.week04

open class Manager(name: String, baseSalary: Int): Employee(name, baseSalary) {

    override fun work(){
        println("$name sedang memimpin rapat divisi.")
    }
    override fun calculateBonus(): Int{
        super.calculateBonus() + 500000
        println("Anda mendapatkan bonus $calculateBonus")
    }
}