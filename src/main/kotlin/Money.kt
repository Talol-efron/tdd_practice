open class Money (private val amount: Int, private val currency: String) {
    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }
    fun equals(money: Money): Boolean {
        return amount == money.amount && currency().equals(money.currency())
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