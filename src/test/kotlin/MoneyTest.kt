import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.amshove.kluent.*

class MoneyTest {
    @Test
    fun testMultiplication() {
        val five = Dollar(5)
//        オブジェクトが保持する値の参照ができない -> hashCode()でamountを返すようにした
        Dollar(5).hashCode() shouldBeEqualTo 5
        Dollar(10).hashCode() shouldBeEqualTo five.times(2).hashCode()
        Dollar(15).hashCode() shouldBeEqualTo five.times(3).hashCode()
    }

    @Test
    fun testEquality() {
        assertTrue(Dollar(5).equals(Dollar(5)))
        assertFalse(Dollar(5).equals(Dollar(6)))
        assertTrue(Franc(5).equals(Franc(5)))
        assertFalse(Franc(5).equals(Franc(6)))
        assertFalse(Franc(5).equals(Dollar(5)))
    }

    @Test
    fun testFrancMultiplication() {
        val five = Franc(5)
        Franc(5).hashCode() shouldBeEqualTo 5
        Franc(10).hashCode() shouldBeEqualTo five.times(2).hashCode()
        Franc(15).hashCode() shouldBeEqualTo five.times(3).hashCode()
    }
}
