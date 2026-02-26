package week3


fun main() {

    // Membuat object Player
    val player = Player("Ghazy")

    // ❌ Ini HARUS error karena xp bersifat private
    // println(player.xp)

    // Tambah XP 50 → masih Level 1
    player.addXp(50)
    println("Level sekarang: ${player.level}")

    // Tambah XP 60 → total 110 → naik ke Level 2
    player.addXp(60)
    println("Level sekarang: ${player.level}")
}