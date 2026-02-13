package oop_00000119273_SteventRichardoPutra.week02

import java.util.Scanner

class Hero (val name: String, val baseDamage: Int, var hp: Int = 100) {
    fun attack(targetName: String){
        println("$name menebas $targetName!")
    }
    fun takeDamage(damage: Int){
        hp -= damage
        if (hp < 0 ){
            hp = 0
        }
    }
    fun isAlive() : Boolean {
        return hp > 0
    }
}

fun main(){
    val scanner = Scanner(System.`in`)

    println("--- Welcome to MINI RPG ---")
    print("Masukkan nama Hero:")
    val name = scanner.nextLine()
    print("Masukkan Base Damage: ")
    val baseDamage = scanner.nextInt()

    val myHero = Hero(name,baseDamage)

    var enemyHp = 100
    val enemyName = "Goblin"

    println("Seekor $enemyName muncul! Pertarungan dimulai!")

    while (myHero.isAlive() && enemyHp > 0) {
        println("\n===== Status =====")
        println("${myHero.name} HP: ${myHero.hp} | $enemyName HP: $enemyHp")
        println("Menu: 1. Serang | 2. Kabur")
        println("Pilih aksi: ")

        when(scanner.nextInt()){
            1 -> {
                myHero.attack(enemyName)
                enemyHp -= myHero.baseDamage
                println("Darah $enemyName tersisa: $enemyHp")

                if (enemyHp > 0){
                    val randomDamage = (10..20).random()
                    println("$enemyName menyerang balik! Kamu terkena $randomDamage")
                    myHero.takeDamage(randomDamage)
                }
            }
            2 -> {
                println("Kamu memilih kabur... Game Over.")
                break
            }
            else -> println("Pilihan tidak valid!")
        }
    }

    println("\n===== HASIL =====")
    if (myHero.isAlive() && enemyHp <= 0){
        println("Selamat! ${myHero.name} memenangkan pertarungan!")
    } else if (!myHero.isAlive()){
        println("Yah... ${myHero.name} telah gugur di medan pertarungan!")
    }
}

