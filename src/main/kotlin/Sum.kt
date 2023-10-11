class Sum(val augend: Money, val added: Money): Expression {
    override fun reduce(bank: Bank, to: String): Money {
        val amount = augend.amount + added.amount
        return Money(amount, to)
    }
}
