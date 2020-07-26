package com.nespot2.objectkotlin.chapter01
/**
 * @author nespot2
 * @since 2020/07/26
 * @version 0.0.1
 **/
class Theater(val ticketSeller: TicketSeller) {

    fun enter(audience: Audience) {
        if (audience.bag.hasInvitation()) {
            val ticket = ticketSeller.ticketOffice.getTicket()
            audience.bag.hasTicket(ticket)
        } else {
            val ticket = ticketSeller.ticketOffice.getTicket()
            audience.bag.minusAmount(ticket.fee)
            ticketSeller.ticketOffice.plusAmount(ticket.fee)
            audience.bag.hasTicket(ticket)
        }
    }
}