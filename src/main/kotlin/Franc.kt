class Franc(amount: Int, currency: String): Money(amount, currency) {
    override fun times(multiplier: Int): Money {
        return Money.franc(amount * multiplier)
    }
}