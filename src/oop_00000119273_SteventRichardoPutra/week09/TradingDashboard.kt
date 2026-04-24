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

}