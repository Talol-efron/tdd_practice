class Franc(amount: Int): Money(amount) {
    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }

    override fun hashCode(): Int {
        return amount
    }
}