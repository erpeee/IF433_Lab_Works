package oop_00000119273_SteventRichardoPutra.week13

import java.io.File

fun main() {
    println("=== Test Write Text ===")
    val file = File("notes.txt")
    file.writeText("Line 1: Inisiialisasi sistem. \n")
    println("File berhasil dibuat dan ditulis.")
}