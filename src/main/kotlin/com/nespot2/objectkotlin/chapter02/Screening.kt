package com.nespot2.objectkotlin.chapter02

import Money

import java.time.LocalDateTime


/**
 * @author nespot2
 * @since 2020/07/27
 * @version 0.0.1
 **/
class Screening(
        private val movie: Movie,
        private val sequence: Int,
        private val whenScreened: LocalDateTime
) {
    fun getStartTime(): LocalDateTime {
        return whenScreened
    }

    fun isSequence(sequence: Int): Boolean {
        return this.sequence == sequence
    }

    fun getMovieFee(): Money {
        return movie.getFee()
    }

    fun reserve(customer: Customer, audienceCount: Int): Reservation {
        return Reservation(customer, this, calculateFee(audienceCount), audienceCount)
    }

    private fun calculateFee(audienceCount: Int): Money {
        return movie.calculateMovieFee(this).times(audienceCount.toDouble())
    }

}