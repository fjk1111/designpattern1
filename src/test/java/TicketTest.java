import org.junit.Test;
import ticketservice.TicketService;
import ticketservice.message.IMessageService;
import ticketservice.message.Message;
import ticketservice.message.MessageService;
import ticketservice.model.Ticket;

public class TicketTest
{
    @Test
    public void test()
    {
        TicketService ticketService = new TicketService();
        IMessageService messageService = new MessageService();

        ticketService.accountReady("myou");
        Ticket ticket = ticketService.newTalk(ticketService.routeAccount(), "customer!!");

        Message message = messageService.getMessage("text");
        message.setContents("메시지1");
        ticket.getChatroom().sendMessage("고객",message);

        message = messageService.getMessage("image");
        message.setContents("이미지1");
        ticket.getChatroom().sendMessage("고객",message);

        message = messageService.getMessage("text");
        message.setContents("메시지2");
        ticket.getChatroom().sendMessage("상담사",message);
    }
}