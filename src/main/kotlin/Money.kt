open class Money (internal val amount: Int, private val currency: String): Expression {
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

    override fun reduce(bank: Bank, to: String): Money {
        val rate: Int = bank.rate(currency, to)
        return Money(amount / rate, to)
    }

    override fun hashCode(): Int {
        return amount
    }
    fun currency(): String {
        return currency
    }
    fun plus(added: Money): Expression {
        return Sum(this, added)
    }

}