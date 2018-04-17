package ticketservice.chatroom;

import ticketservice.message.Message;
import ticketservice.model.ChatRoom;

public class ChatRoomService implements IChatRoomService
{
    ChatRoom chatroom;

    public ChatRoomService(ChatRoom chatroom)
    {
        this.chatroom = chatroom;
    }

    public boolean sendMessage(String user, Message message)
    {
        System.out.println(user + " 메시지 전송 : " + message.getContents());
        return true;
    }
}