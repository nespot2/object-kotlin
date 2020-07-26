package com.nespot2.objectkotlin.chapter01

/**
 * @author nespot2
 * @since 2020/07/26
 * @version 0.0.1
 **/
class Bag(
    var amount: Long = 0,
    var invitation: Invitation? = null,
    var ticket: Ticket? = null
) {

    fun hasInvitation(): Boolean {
        return this.invitation != null
    }

    fun hasTicket(): Boolean {
        return ticket != null
    }

    fun hasTicket(ticket: Ticket?) {
        this.ticket = ticket
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }

}

