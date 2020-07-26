package com.nespot2.objectkotlin.chapter01


/**
 * @author nespot2
 * @since 2020/07/26
 * @version 0.0.1
 **/
class TicketOffice(
    var amount: Long,
    var tickets: List<Ticket> = ArrayList()
) {

    fun getTicket(): Ticket {
        val first = tickets.first()
        this.tickets = tickets.drop(1)
        return first
    }

    fun minusAmount(amount: Long) {
        this.amount -= amount
    }

    fun plusAmount(amount: Long) {
        this.amount += amount
    }


}