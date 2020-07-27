package com.nespot2.objectkotlin.chapter02

import Money


/**
 * @author nespot2
 * @since 2020/07/27
 * @version 0.0.1
 **/
data class Reservation(val customer: Customer, val screening: Screening, val fee: Money, val audienceCount: Int)