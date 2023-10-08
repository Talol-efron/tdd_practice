class Dollar(private var amount: Int) {
    fun times(multiplier: Int): Franc {
        return Franc(amount * multiplier)
    }

    fun equals(obj: Dollar): Boolean {
        return amount == obj.amount
    }

    override fun hashCode(): Int {
        return amount
    }
}