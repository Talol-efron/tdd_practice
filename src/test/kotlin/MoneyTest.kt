import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.amshove.kluent.shouldBeEqualTo

class MoneyTest {
    @Test
    fun testMultiplication() {
        val target = Dollar(5)
        target.times(2)
        target.amount shouldBeEqualTo 10
    }
}
