package oop_00000119273_SteventRichardoPutra.week13

import java.io.File

fun main() {
    println("=== Test Write Text ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisiialisasi sistem. \n")
    println("File berhasil dibuat dan ditulis.")

    file.appendText("Line 2: Menambahkan konfigurasi baru.\n")
    println("Teks berhasil di-append.")

    println("\n=== Test Read Text ===")
    val fullContent = file.readText()
    println("Membaca sekaligus:\n$fullContent")

    println("=== Test Read Lines ===")
    val lines = file.readLines()
    lines.forEachIndexed { index, line ->
        println("Isi Index $index: $line")
    }
}