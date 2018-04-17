package ticketservice.message;

public class MessageService implements IMessageService
{
    public Message getMessage(String messageType)
    {
        return SimpleMessageFactory.createMessage(messageType);
    }
}
