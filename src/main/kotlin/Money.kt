open abstract class Money(protected val amount: Int, protected val currency: String) {
    abstract fun times(multiplier: Int): Money
    fun equals(money: Money): Boolean {
        return amount == money.amount && this::class == money::class
    }
    companion object {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount, "USD")
        }
        fun franc(amount: Int): Franc {
            return Franc(amount, "CHF")
        }
    }
    override fun hashCode(): Int {
        return amount
    }
    fun currency(): String {
        return currency
    }
}