package oop_00000119273_SteventRichardoPutra.week06

interface SmartInterfaces {
    val id: String
    val name: String
}

interface Switchable{
    fun turnOn()
    fun turnOff()
}

interface Recordable{
    fun startRecord()
    fun stopRecord(){ println("Perekaman dihentikan dan disimpan ke Cloud.") }
}