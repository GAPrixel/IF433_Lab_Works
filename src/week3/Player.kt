package week3

class Player(val username: String) {

    // XP tidak bisa diubah dari luar class
    private var xp: Int = 0

    // Computed Property untuk level
    val level: Int
        get() = (xp / 100) + 1

    // Function untuk menambah XP
    fun addXp(amount: Int) {
        // hanya menerima angka positif
        if (amount <= 0) {
            println("XP harus bernilai positif!")
            return
        }

        val oldLevel = level   // simpan level sebelum XP ditambah
        xp += amount           // tambah XP

        val newLevel = level   // cek level setelah XP bertambah

        // jika level naik
        if (newLevel > oldLevel) {
            println("Level Up! Selamat $username naik ke level $newLevel")
        }
    }
}