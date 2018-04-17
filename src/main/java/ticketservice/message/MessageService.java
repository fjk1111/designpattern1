package ticketservice.message;

public class MessageService implements IMessageService
{

    public Message getMessage(String messageType)
    {
        Message message = null;
        if(messageType.equals("image"))
        {
            message = new Image();
        }
        else
        {
            message = new Text();
        }
        return message;
    }
}
