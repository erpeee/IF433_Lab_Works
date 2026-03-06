package oop_00000119273_SteventRichardoPutra.week05

fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== Aktivitas Pegawai ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when(pegawai){
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }

    val math = MathHelper()
    println(math.hitungLuas(20))
    println(math.hitungLuas(10,10))
    println(math.hitungLuas(3.20))

    val wallet = EWallet(50000)
    val credit = CreditCard(100000)

    val paymentList: List<PaymentMethod> = listOf(wallet, credit)

    for (payment in paymentList){
        println("--- Memproses Pembayaran untuk ${payment.accountName} ---")
        payment.processPayment(75000)
    }
}
