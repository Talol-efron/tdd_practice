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
        val reduced = bank.reduce(sum, "USD").hashCode()
//        sum shouldBeEqualTo Money.dollar(10)
//        reduced shouldBeEqualTo Money.dollar(10)
        assertEquals(reduced, Money.dollar(10).hashCode())
    }
}
