import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.amshove.kluent.shouldBeEqualTo

class MoneyTest {
    @Test
    fun testMultiplication() {
        val five = Dollar(5)
        var product = five.times(2)
        product.amount shouldBeEqualTo 10
        product = five.times(3)
        product.amount shouldBeEqualTo 15
    }
}
