package oop_00000119273_SteventRichardoPutra.week06

class SmartSpeaker(override val id: String, override val name: String) : SmartDevice, Switchable {
    override fun turnOn() {
        println("Speaker(ID: $id) dinyalakan!")
    }
    override fun turnOff() {
        println("Speaker(ID: $id) dimatikan!")
    }
    fun playMusic(song: String){
        println("Memutar lagu $song dari Spotify")
    }
}