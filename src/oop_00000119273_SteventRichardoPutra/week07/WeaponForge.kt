package oop_00000119273_SteventRichardoPutra.week07

class WeaponForge private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): WeaponForge{
            val starterItem = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return WeaponForge(starterItem, 50)
        }
        fun forgeEpicSword(): WeaponForge{
            val epicItem = GameItem("Pedang Excalibur", 99, ItemRarity.EPIC)
            return WeaponForge(epicItem, 100,)
        }
    }
}

