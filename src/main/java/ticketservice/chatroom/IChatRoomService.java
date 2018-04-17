package ticketservice.chatroom;

import ticketservice.message.Message;

public interface IChatRoomService
{
    public boolean sendMessage(String user, Message message);
}
