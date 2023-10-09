class Sum(val augend: Money, val added: Money): Expression {
    override fun reduce(to: String): Money {
        val amount = augend.amount + added.amount
        return Money(amount, to)
    }
}
