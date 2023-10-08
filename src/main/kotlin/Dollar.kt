
class Dollar(private var amount: Int) {
    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    fun equals(obj: Dollar): Boolean {
        return amount == obj.amount
    }

    override fun hashCode(): Int {
        return amount
    }
}