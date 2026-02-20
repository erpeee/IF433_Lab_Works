package oop_00000119273_SteventRichardoPutra.week03

import java.util.Scanner

class Weapon (val name: String){
    var damage: Int = 0
        set(value) {
            if( value < 0 ){
                println("ERROR: Damage tidak boleh negatif!")
            }else if( value > 1000){
                println("Damage melebihi maksimal (1000). Dipaksa ke 1000")
                field = 1000
            }else {
                field = value
            }
        }

    val tier: String
        get(){
            return when{
                damage > 800 -> "Legendary"
                damage > 500 -> "Epic"
                else -> "Common"
            }
        }
}

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- Welcome to Toko Senjata ---")
    print("Masukkan nama senjata: ")
    val inputName = scanner.nextLine()

    val myWeapon = Weapon(inputName)

    print("Masukkan damage senjata: ")
    var inputDamage = scanner.nextInt()

    myWeapon.damage = inputDamage

    println("===== Detail Senjata =====")
    println("Nama senjata: ${myWeapon.name}")
    println("Damage senjata: ${myWeapon.damage}")
    println("Tier senjata: ${myWeapon.tier}")
}