import java.math.BigDecimal

/**
 * @author nespot2
 * @version 0.0.1
 * @since 2020/07/27
 */
data class Money(val amount: BigDecimal) {
    operator fun plus(amount: Money): Money {
        return Money(this.amount + amount.amount)
    }

    operator fun minus(amount: Money): Money {
        return Money(this.amount - amount.amount)
    }

    operator fun times(percent: Double): Money {
        return Money(amount * BigDecimal.valueOf(percent))
    }

    fun isLessThan(other: Money): Boolean {
        return amount < other.amount
    }

    fun isGreaterThanOrEqual(other: Money): Boolean {
        return amount >= other.amount
    }

    companion object {
        val ZERO = wons(0)
        fun wons(amount: Long): Money {
            return Money(BigDecimal.valueOf(amount))
        }

        fun wons(amount: Double): Money {
            return Money(BigDecimal.valueOf(amount))
        }
    }

}