package com.nespot2.objectkotlin.chapter02.pricing

import Money
import com.nespot2.objectkotlin.chapter02.DiscountPolicy
import com.nespot2.objectkotlin.chapter02.Screening


/**
 * @author nespot2
 * @since 2020/07/27
 * @version 0.0.1
 **/
class NoneDiscountPolicy : DiscountPolicy {
    override fun calculateDiscountAmount(screening: Screening): Money {
        return Money.ZERO
    }
}