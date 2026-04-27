package OOP_82331_GhazyAthaqiSupriadi.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 15.2, "CLOSED"),   // profit
        TradeLog("ETHUSDT", "SHORT", 5, -8.5, "CLOSED"),   // loss
        TradeLog("BTCUSDT", "LONG", 20, 25.0, "OPEN"),     // profit
        TradeLog("ETHUSDT", "LONG", 10, -3.2, "OPEN"),     // loss
        TradeLog("BTCUSDT", "SHORT", 15, 5.5, "CLOSED"),   // profit
        TradeLog("ETHUSDT", "SHORT", 8, -12.0, "CLOSED")   // loss
    )

    // Optional: print untuk cek data
    tradeHistory.forEach { println(it) }

    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }

// Optional: cek hasil
    println("Closed Trades:")
    closedTrades.forEach { println(it) }
}