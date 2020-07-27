package com.nespot2.objectkotlin.chapter02.pricing

import com.nespot2.objectkotlin.chapter02.DiscountCondition
import com.nespot2.objectkotlin.chapter02.Screening
import java.time.DayOfWeek
import java.time.LocalTime


/**
 * @author nespot2
 * @since 2020/07/27
 * @version 0.0.1
 **/
class PeriodCondition(private val dayOfWeek: DayOfWeek,
                      private val startTime: LocalTime,
                      private val endTime: LocalTime) : DiscountCondition {
    override fun isSatisfiedBy(screening: Screening): Boolean {
        return screening.getStartTime().dayOfWeek == dayOfWeek
                && startTime < screening.getStartTime().toLocalTime()
                && endTime >= screening.getStartTime().toLocalTime()
    }
}