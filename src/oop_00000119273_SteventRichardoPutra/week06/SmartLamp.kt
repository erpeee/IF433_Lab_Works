package oop_00000119273_SteventRichardoPutra.week06

class SmartLamp(override val id: String, override val name: String): SmartDevice, Switchable {
    override fun turnOn() {
        println("Lampu(ID: $id) menyala!")
    }
    override fun turnOff() {
        println("Lampu(ID: $id) dimatikan!")
    }
}