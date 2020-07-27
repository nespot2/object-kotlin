package chapter02

import Money
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.math.BigDecimal

/**
 * @author nespot2
 * @since 2020/07/27
 * @version 0.0.1
 **/
class MoneyTest {

    @Test
    fun moneyTest() {
        val zero = Money.ZERO
        val one = Money.wons(1)
        val ten = Money.wons(10)
        val oneDotFive = Money.wons(1.5)

        val whatValue1 = zero + one
        val whatValue2 = zero * 0.2
        val whatValue3 = one + oneDotFive

        assertEquals(BigDecimal.ONE, whatValue1.amount)
        assertEquals(BigDecimal.valueOf(0.0), whatValue2.amount)
        assertEquals(BigDecimal.valueOf(2.5), whatValue3.amount)

        assertTrue(one.isLessThan(ten))
        assertTrue(ten.isGreaterThanOrEqual(ten))
    }
}