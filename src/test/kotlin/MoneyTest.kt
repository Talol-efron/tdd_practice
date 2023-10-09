import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.amshove.kluent.*

class MoneyTest {
    @Test
    fun testMultiplication() {
        val five = Money.dollar(5)
//        オブジェクトが保持する値の参照ができない -> hashCode()でamountを返すようにした
        Money.dollar(5).hashCode() shouldBeEqualTo 5
        Money.dollar(10).hashCode() shouldBeEqualTo five.times(2).hashCode()
        Money.dollar(15).hashCode() shouldBeEqualTo five.times(3).hashCode()
    }
    @Test
    fun testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)))
        assertFalse(Money.dollar(5).equals(Money.dollar(6)))
        assertFalse(Money.franc(5).equals(Money.dollar(5)))
    }
    @Test
    fun testCurrency(){
        Money.dollar(1).currency() shouldBeEqualTo "USD"
        Money.franc(1).currency() shouldBeEqualTo "CHF"
    }
    @Test
    fun testSimpleAddition() {
        val five = Money.dollar(5)
        val sum: Expression = five.plus(five)
        val bank: Bank = Bank()
        val reduced = bank.reduce(sum, "USD")
//        reduced shouldBeEqualTo Money.dollar(10)
        assertEquals(reduced.hashCode(), Money.dollar(10).hashCode())
    }
    @Test
    fun testPlusReturnsSum() {
        val five = Money.dollar(5)
        val result = five.plus(five)
        val sum = result as Sum
        sum.augend shouldBeEqualTo five
        sum.added shouldBeEqualTo five
    }
    @Test
    fun testReduceSum() {
        val sum = Sum(Money.dollar(3), Money.dollar(4))
        val bank = Bank()
        val result: Money = bank.reduce(sum, "USD")
        result.hashCode() shouldBeEqualTo Money.dollar(7).hashCode()
    }
    @Test
    fun testReduceMoney() {
        val bank = Bank()
        val result = bank.reduce(Money.dollar(1), "USD")
        result.hashCode() shouldBeEqualTo Money.dollar(1).hashCode()
    }
}
