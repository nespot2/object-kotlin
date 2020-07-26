package chapter01

import com.nespot2.objectkotlin.chapter01.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

/**
 * @author nespot2
 * @since 2020/07/27
 * @version 0.0.1
 **/
class Chapter01AsIsTest {

    @Test
    fun enter() {

        val invitation = Invitation(LocalDateTime.now())

        val bag1 = Bag(5000)

        val bag2 = Bag(10000, invitation)

        val audience1 = Audience(bag1)
        val audience2 = Audience(bag2)

        val ticket1 = Ticket(5000)
        val ticket2 = Ticket(50000)

        val ticketOffice = TicketOffice(0, listOf(ticket1, ticket2))
        val ticketSeller = TicketSeller(ticketOffice)

        val theater = Theater(ticketSeller)

        theater.enter(audience1)
        theater.enter(audience2)

        assertEquals(0, audience1.bag.amount)
        assertNotNull(audience1.bag.ticket)
        assertEquals(10000, audience2.bag.amount)
        assertNotNull(audience2.bag.ticket)
        assertEquals(5000, ticketOffice.amount)


    }
}