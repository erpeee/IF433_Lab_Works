package oop_00000119273_SteventRichardoPutra.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 50, 120.0, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 20, -10.5, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, 25.0, "OPEN"),
        TradeLog("BTCUSDT", "SHORT", 20, 0.0, "OPEN")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev : ${it.leverage}x)"}

    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    val uniquePairs = tradeHistory.map { it.pair}. toSet()

    println("=== Crypto Trading Dashboard ===")
    println("\n[Top Performers]")
    topPerformersString.forEach { baris ->
        println(baris)
    }
    println("\n[Worst Performers]")
    worstPerformersString.forEach { println(it) }
}