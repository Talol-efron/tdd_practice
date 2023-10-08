open class Money(protected val amount: Int) {
    fun equals(money: Money): Boolean {
        return amount == money.amount && this::class == money::class
    }

    override fun hashCode(): Int {
        return amount
    }
}