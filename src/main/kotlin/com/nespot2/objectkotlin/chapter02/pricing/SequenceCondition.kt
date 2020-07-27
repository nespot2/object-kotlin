package com.nespot2.objectkotlin.chapter02.pricing

import com.nespot2.objectkotlin.chapter02.DiscountCondition
import com.nespot2.objectkotlin.chapter02.Screening


/**
 * @author nespot2
 * @since 2020/07/27
 * @version 0.0.1
 **/
class SequenceCondition(private val sequence: Int) : DiscountCondition {
    override fun isSatisfiedBy(screening: Screening): Boolean {
        return screening.isSequence(sequence)
    }
}