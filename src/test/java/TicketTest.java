import org.junit.Test;
import ticketservice.Public;
import ticketservice.TicketService;
import ticketservice.message.IMessageService;
import ticketservice.message.Message;
import ticketservice.message.MessageService;
import ticketservice.model.Ticket;

public class TicketTest
{
    TicketService ticketService = new TicketService();
    IMessageService messageService = new MessageService();

    @Test
    public void test()
    {
        ticketService.accountReady("myou");

        Ticket ticket = ticketService.newTalk(ticketService.routeAccount(), "customer!!", "PC");

        Message message = messageService.getMessage("text");
        message.setContents("텍스트");
        ticket.getChatroom().sendMessage(Public.USER_TYPE_CUSTOMER, message);

        message = messageService.getMessage("image");
        message.setContents("이미지");
        ticket.getChatroom().sendMessage(Public.USER_TYPE_CUSTOMER, message);
    }

    @Test
    public void pushTest()
    {
        ticketService.accountReady("myou");

        Ticket ticket = ticketService.newTalk(ticketService.routeAccount(), "customer!!", "APP");

        Message message = messageService.getMessage("text");
        message.setContents("메시지1");
        ticket.getChatroom().sendMessage(Public.USER_TYPE_CUSTOMER,message);

        message = messageService.getMessage("text");
        message.setContents("메시지2");
        ticket.getChatroom().sendMessage(Public.USER_TYPE_AGENT,message);
    }
}