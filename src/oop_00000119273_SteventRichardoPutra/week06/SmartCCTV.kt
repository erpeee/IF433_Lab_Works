package oop_00000119273_SteventRichardoPutra.week06

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("$name (ID: $id) dinyalakan.")
        startRecord()
    }
    override fun turnOff() {
        println("$name (ID: $id) dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("$name sedang merekam.")
    }
}