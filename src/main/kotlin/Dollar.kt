
class Dollar(var amount: Int) {
    fun times(multiplier: Int): Dollar {
        return Dollar(amount * multiplier)
    }

    fun equals(obj: Dollar): Boolean {
        return amount == obj.amount
    }
}