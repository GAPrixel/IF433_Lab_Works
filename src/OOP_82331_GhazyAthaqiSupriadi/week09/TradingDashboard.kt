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


    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }



    val winningTrades = closedTrades
        .filter { it.roe > 0 }



    val losingTrades = closedTrades
        .filter { it.roe <= 0 }



    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }



    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map {
            "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"
        }



    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    println("\n=== CRYPTO TRADING DASHBOARD ===")

    topPerformersString.forEach { println(it) }
}