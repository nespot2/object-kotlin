package com.nespot2.objectkotlin.chapter02

import Money
import java.time.Duration


/**
 * @author nespot2
 * @since 2020/07/27
 * @version 0.0.1
 **/
class Movie(
        val title: String,
        val runningTime: Duration,
        private val fee: Money,
        private val discountPolicy: DiscountPolicy
) {
    fun getFee(): Money {
        return fee
    }

    fun calculateMovieFee(screening: Screening?): Money {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening!!))
    }

}