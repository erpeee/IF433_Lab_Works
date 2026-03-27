package oop_00000119273_SteventRichardoPutra.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.SafeZone -> println("Anda berada di Safe Zone. Silakan beristirahat.")
        is BattleState.MonsterEncounter -> println("Waspada! Muncul monster: ${event.monsterName}")
        is BattleState.LootDropped -> {
            // Destructuring data class GameItem
            val (name, dmg, rarity) = event.item
            println("Harta Karun! Mendapatkan $name (Dmg: $dmg, Rarity: $rarity)")
        }
        is BattleState.GameOver -> println("GAME OVER: ${event.reason}")
    }
}