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
        assertTrue(Money.franc(5).equals(Money.franc(5)))
        assertFalse(Money.franc(5).equals(Money.franc(6)))
        assertFalse(Money.franc(5).equals(Money.dollar(5)))
    }
    @Test
    fun testFrancMultiplication() {
        val five = Money.franc(5)
        Money.franc(5).hashCode() shouldBeEqualTo 5
        Money.franc(10).hashCode() shouldBeEqualTo five.times(2).hashCode()
        Money.franc(15).hashCode() shouldBeEqualTo five.times(3).hashCode()
    }
    @Test
    fun testCurrency(){
        Money.dollar(1).currency() shouldBeEqualTo "USD"
        Money.franc(1).currency() shouldBeEqualTo "CHF"
    }
    @Test
    fun testDifferentClassEquality() {
        assertTrue(Money(10, "CHF").equals(Franc(10, "CHF")) )
    }
}
