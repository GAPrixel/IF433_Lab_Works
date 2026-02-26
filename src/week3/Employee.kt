package week3

class Employee(val name : String) {
    var salary : Int = 0
        set(value) {
            if (value < 0){
                println("error : gk bisa negatif")
                field = 0
            } else {
                field = value
            }
        }
    private var performanceRating: Int = 3

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performanceRating")
    }
}