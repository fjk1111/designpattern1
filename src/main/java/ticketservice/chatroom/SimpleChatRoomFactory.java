package ticketservice.chatroom;

import ticketservice.model.ChatRoom;

public class SimpleChatRoomFactory
{
    public static IChatRoomService createChatRoom(String channelType, ChatRoom chatRoom)
    {
        IChatRoomService chatroomService = null;
        if(channelType.equals("APP"))
        {
            chatroomService = new AppChatRoomService(chatRoom);
        }
        else
        {
            chatroomService = new PcChatRoomService(chatRoom);
        }
        return chatroomService;
    }
}
