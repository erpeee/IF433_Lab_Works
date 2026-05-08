package oop_00000119273_SteventRichardoPutra.week11

fun main() {
    val homeDevices = mutableListOf<SmartDevice>()

    SmartDevice("", ""). apply {
        name = "Philips WiZ Living Room",
        category = "Lighting",
        isOnline = true,
        powerLoad = 12
    }
}