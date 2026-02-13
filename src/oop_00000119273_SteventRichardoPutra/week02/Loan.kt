package oop_00000119273_SteventRichardoPutra.week02

import java.util.Scanner

class Loan (val bookTitle: String, val borrower: String, var loanDuration: Int = 1){
    fun calculateFine(): Int{
        return if(loanDuration > 3){
            (loanDuration - 3) * 2000
        }else{
            0
        }
    }
}

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- LIBRARY SYSTEM ---")

    print("Masukkan Judul: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama pinjam (dalam hari): ")
    var loanDuration = scanner.nextInt()

    if(loanDuration < 0){
        print("WARNING: Durasi tidak valid ($loanDuration). Otomatis diubah menjadi 1 hari.")
        loanDuration = 1
    }
    val pinjaman = Loan(bookTitle, borrower, loanDuration)

    println("--- Detail Peminjaman ---")
    println("Judul : ${pinjaman.bookTitle}")
    println("Nama Peminjam: ${pinjaman.borrower}")
    println("Durasi: ${pinjaman.loanDuration} hari")
    println("Denda: Rp ${pinjaman.calculateFine()}")
    println("--------------------------")
}