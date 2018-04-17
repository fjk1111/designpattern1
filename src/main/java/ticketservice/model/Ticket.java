package ticketservice.model;

import ticketservice.chatroom.IChatRoomService;

public class Ticket extends Model
{
    String ticketStatus;
    IChatRoomService chatroom;

    public String getTicketStatus()
    {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus)
    {
        this.ticketStatus = ticketStatus;
    }

    public IChatRoomService getChatroom()
    {
        return chatroom;
    }

    public void setChatroom(IChatRoomService chatroom)
    {
        this.chatroom = chatroom;
    }
}
