package ticketservice;

import ticketservice.chatroom.ChatRoomService;
import ticketservice.model.ChatRoom;
import ticketservice.model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketService implements ITicketService
{
    List<String> accountIds = new ArrayList();

    public void accountReady(String accountId)
    {
        accountIds.add(accountId);
    }

    public String routeAccount()
    {
        return accountIds.get(0);
    }

    public Ticket newTalk(String accountId, String customerId)
    {
        Ticket ticket = new Ticket();
        ticket.setId("uuid");
        ticket.setTicketStatus("start");

        //create chat room
        ChatRoom chatroom = new ChatRoom();
        chatroom.setAccountId(accountId);
        chatroom.setCustomerId(customerId);
        ChatRoomService chatRoomService = new ChatRoomService(chatroom);
        ticket.setChatroom(chatRoomService);

        return ticket;
    }
}
