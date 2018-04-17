import org.junit.Test;
import ticketservice.TicketService;
import ticketservice.model.Ticket;

public class TicketTest
{
    @Test
    public void test()
    {
        TicketService ticketService = new TicketService();
        ticketService.accountReady("myou");

        Ticket ticket = ticketService.newTalk(ticketService.routeAccount(), "customer!!");

        ticket.getChatroom().sendMessage("고객","안녕하세요!!!!");
        ticket.getChatroom().sendMessage("상담사","네 고갱님");
    }
}