package oop_00000119273_SteventRichardoPutra.week04

open class Developer(name: String, baseSalary: Int, val programmingLanguage: String): Manager(name, baseSalary) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    super.calculateBonus()
    }
}