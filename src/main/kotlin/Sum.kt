class Sum(val augend: Expression, val added: Expression): Expression {
    override fun reduce(bank: Bank, to: String): Money {
        val amount = augend.reduce(bank, to).amount + added.reduce(bank, to).amount
        return Money(amount, to)
    }

    override fun plus(added: Expression): Expression {
        return Sum(this, added)
    }
    override fun times(multiplier: Int): Expression {
        return Sum(augend.times(multiplier), added.times(multiplier))
    }
}
