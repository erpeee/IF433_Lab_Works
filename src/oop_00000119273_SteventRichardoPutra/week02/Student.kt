package oop_00000119273_SteventRichardoPutra.week02

class Student(val name: String, val nim: String, var major: String,  var gpa: Double = 0.0) {
    constructor(name: String, nim: String) : this(name, nim, major = "Non-Matriculated", gpa = 0.0) {
        println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan). ")
    }
    init {
        if (nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek Student $name berhasil dialokasikan di Memory.")
        }
    }
}