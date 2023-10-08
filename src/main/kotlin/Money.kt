open class Money(protected val amount: Int) {
//    abstract fun times(multiplier: Int): Money
    fun equals(money: Money): Boolean {
        return amount == money.amount && this::class == money::class
    }

    companion object {
        fun dollar(amount: Int): Dollar {
            return Dollar(amount)
        }

        fun franc(amount: Int): Franc {
            return Franc(amount)
        }
    }
    override fun hashCode(): Int {
        return amount
    }
}