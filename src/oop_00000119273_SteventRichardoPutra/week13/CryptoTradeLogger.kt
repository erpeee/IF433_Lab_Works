package oop_00000119273_SteventRichardoPutra.week13

import java.io.File
import java.io.PrintWriter
import java.io.FileNotFoundException

data class TradeRecord(val id: Int, val symbol: String, val type: String, val margin: Double, val pnl: Double)

fun TradeRecord.toCsv(): String {
    return "$id, $symbol, $type, $margin, $pnl"
}

fun fromCsvTrade(line: String): TradeRecord? {
    return try {
        val tokens = line.split(",")
        val id = tokens[0].trim().toInt()
        val symbol = tokens[1].trim()
        val type = tokens[2].trim()
        val margin = tokens[3].trim().toDouble()
        val pnl = tokens[4].trim().toDouble()

        TradeRecord(id, symbol, type, margin, pnl)
    } catch (e: Exception) {
        println("(Log) Data korup diabaikan: $line")
        null
    }
}

fun saveTrades(trades: List<TradeRecord>, path: String) {
    File(path).printWriter().use { writer ->
        trades.forEach { trade ->
            writer.println(trade.toCsv())
        }
    }
}

fun loadTrades(path: String): List<TradeRecord> {
    return try{
        File(path).readLines().mapNotNull { fromCsvTrade(it) }
    } catch( e: FileNotFoundException) {
        println("(Log) File tidak ditemukan: $path")
        emptyList()
    }
}

fun main() {
    val filePath = "crypto_trades.csv"
    val mockTrades = listOf(
        TradeRecord(1, "BTCUSDT", "Long", 150.0, 45.5),
        TradeRecord(2, "ETHUSDT", "Short", 100.0, -12.3),
        TradeRecord(3, "SOLUSDT", "Long", 50.0, 15.8)
    )
    saveTrades(mockTrades, filePath)

    File(filePath).appendText("CORRUPT_ID, DOGEUSDT, Hold, XX, YY\n")

    val loadedData = loadTrades(filePath)
    val totalPnl = loadedData.sumOf { it.pnl }

    println("\n--- Daftar Transaksi Valid ---")
    loadedData.forEach { trade ->
        println("ID: ${trade.id} | ${trade.symbol} (${trade.type}) | Margin: ${trade.margin} | PnL: ${trade.pnl}")
    }
    println("=== Total PnL Bersih: $totalPnl ===")
}