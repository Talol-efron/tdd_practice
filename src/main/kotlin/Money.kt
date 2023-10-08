open class Money(protected val amount: Int) {
    fun equals(obj: Money): Boolean {
        return amount == obj.amount
    }
}