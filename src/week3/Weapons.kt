package week3

class Weapon(val name: String) {

    var damage: Int = 0
        set(value) {
            when {
                value < 0 -> {
                    println("Damage tidak boleh negatif! Nilai tidak diubah.")
                    // tidak mengubah field (tetap nilai lama)
                }

                value > 1000 -> {
                    println("Damage terlalu besar! Diset ke batas maksimum (1000).")
                    field = 1000
                }

                else -> {
                    field = value
                }
            }
        }

    // Computed Property (Getter only)
    val tier: String
        get() = when {
            damage > 800 -> "Legendary"
            damage > 500 -> "Epic"
            else -> "Common"
        }
}
