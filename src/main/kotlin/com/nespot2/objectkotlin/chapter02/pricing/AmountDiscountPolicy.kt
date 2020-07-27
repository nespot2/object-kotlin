package com.nespot2.objectkotlin.chapter02.pricing

import Money
import com.nespot2.objectkotlin.chapter02.DefaultDiscountPolicy
import com.nespot2.objectkotlin.chapter02.DiscountCondition
import com.nespot2.objectkotlin.chapter02.Screening


/**
 * @author nespot2
 * @since 2020/07/27
 * @version 0.0.1
 **/
class AmountDiscountPolicy(private val discountAmount: Money, vararg conditions: DiscountCondition) : DefaultDiscountPolicy(*conditions) {

    override fun getDiscountAmount(screening: Screening): Money {
        return discountAmount
    }


}