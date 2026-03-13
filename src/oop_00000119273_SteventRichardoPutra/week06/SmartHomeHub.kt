package oop_00000119273_SteventRichardoPutra.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()
    fun addDevice(device: SmartDevice){
        devices.add(device)
        println("${device.name} added")
    }
    fun turnOffAllSwitches(){
        println("\n---- Mengakses Sistem Pusat: Mematikan Semua Saklar ---")
        for (device in devices){
            if(device is Switchable){
                device.turnOff()
            } else {
                println("${device.name} is not switchable")
            }

        }
    }
    fun activateSecurityModed(){
        for (device in devices){
            if (device is Recordable)
                device.startRecord()
            if (device is SmartSpeaker)
                device.playMusic("Sirine Peringatan.")
        }
    }
}