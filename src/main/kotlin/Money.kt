open class Money (private val amount: Int, private val currency: String): Expression {
    fun times(multiplier: Int): Money {
        return Money(amount * multiplier, currency)
    }
    fun equals(money: Money): Boolean {
        return amount == money.amount && currency().equals(money.currency())
    }
    companion object {
        fun dollar(amount: Int): Money {
            return Money(amount, "USD")
        }
        fun franc(amount: Int): Money {
            return Money(amount, "CHF")
        }
    }
    override fun hashCode(): Int {
        return amount
    }
    fun currency(): String {
        return currency
    }
    fun plus(added: Money): Expression {
        return Money(amount + added.amount, currency)
    }
}