package oop_00000119273_SteventRichardoPutra.week13

import java.io.File

fun main() {
    println("=== Test Unsafe Resource Handling ===")
    val unsafeFile = File("unsafe_logs.txt")
    val writer = unsafeFile.printWriter()

    writer.println("Log 1: Membuka koneksi database...")
    writer.println("Log 2: Menulis data pengguna...")

    writer.close()
    println("Proses penulisan unsafe selesai.")

    println("\n=== Test Safe Resource Handling ===")
    val safeFile = File("safe_logs.txt")
    safeFile.printWriter().use { out ->
        for (i in 1..100) {
            out.println("Safe Log Entry #$i: System status OK.")
        }
    }
    println("100 baris log berhasil di-generate dengan sangat aman.")

    println("\n=== Test Buffered Reader ===")
    safeFile.bufferedReader().use { reader ->
        reader.lineSequence().take(5).forEach { line ->
            println("Stream Read: $line")
        }
    }
}