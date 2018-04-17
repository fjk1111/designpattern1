package ticketservice.chatroom;

import ticketservice.model.ChatRoom;

public class ChatRoomService implements IChatRoomService
{
    ChatRoom chatroom;

    public ChatRoomService(ChatRoom chatroom)
    {
        this.chatroom = chatroom;
    }

    public boolean sendMessage(String user, String message)
    {
        System.out.println(user + " 메시지 전송 : " + message);
        return true;
    }
}