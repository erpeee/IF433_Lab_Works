package oop_00000119273_SteventRichardoPutra.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan perkuliahan dan merevisi RPKPS.")
    }

    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}