class Dollar(amount: Int, currency: String): Money(amount, currency) {
    override fun times(multiplier: Int): Money {
        return Money.dollar(amount * multiplier)
    }
}