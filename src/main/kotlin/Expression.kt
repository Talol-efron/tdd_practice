interface Expression {
    fun plus(added: Expression): Expression
    fun reduce(bank: Bank, to: String): Money
}