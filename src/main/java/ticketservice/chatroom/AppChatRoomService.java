package ticketservice.chatroom;

import ticketservice.Public;
import ticketservice.message.Message;
import ticketservice.model.ChatRoom;

public class AppChatRoomService implements IChatRoomService
{
    ChatRoom chatroom;

    public AppChatRoomService(ChatRoom chatroom)
    {
        this.chatroom = chatroom;
    }

    public boolean sendMessage(String user, Message message)
    {
        System.out.println(user + " 메시지 전송 : " + message.getContents());
        if(Public.USER_TYPE_AGENT.equals(user))
        {
            sendPush(user, message);
        }
        return true;
    }

    public boolean sendPush(String user, Message message)
    {
        System.out.println(user + " 푸쉬 전송 !!!!!  " + message.getContents());
        return true;
    }
}
