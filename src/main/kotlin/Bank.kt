import kotlin.collections.HashMap
import kotlin.collections.MutableMap
class Bank {
    private val rates: MutableMap<Pair, Int> = HashMap()
    fun reduce(source: Expression, to: String): Money {
        return source.reduce(this, to)
    }
    fun addRate(from: String, to: String, rate: Int) {
        rates[Pair(from, to)] = rate
    }
    fun rate(from: String, to: String): Int {
        if (from == to) return 1
//        add non-null assertをした。!!をつけた。応急処置。
        return rates[Pair(from, to)]!!
    }
}
