package com.nespot2.objectkotlin.chapter02

import Money
import java.util.*


/**
 * @author nespot2
 * @since 2020/07/27
 * @version 0.0.1
 **/
abstract class DefaultDiscountPolicy(vararg conditions: DiscountCondition) : DiscountPolicy {
    private var conditions: List<DiscountCondition> = ArrayList()

    init {
        this.conditions = listOf(*conditions)
    }

    override fun calculateDiscountAmount(screening: Screening): Money {
        for (each in conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening)
            }
        }
        return Money.ZERO
    }

    protected abstract fun getDiscountAmount(screening: Screening): Money


}