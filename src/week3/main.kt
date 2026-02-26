package week3


fun main() {
    val weapon = Weapon("Dragon Slayer")

    // Test 1: Damage negatif (harus gagal)
    weapon.damage = -50

    // Test 2: Damage terlalu besar (harus dipaksa jadi 1000)
    weapon.damage = 9999

    // Print hasil akhir
    println("Weapon: ${weapon.name}")
    println("Damage: ${weapon.damage}")
    println("Tier: ${weapon.tier}")
}