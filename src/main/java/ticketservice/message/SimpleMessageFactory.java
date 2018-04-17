package ticketservice.message;

public class SimpleMessageFactory
{
    public static Message createMessage(String messageType)
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
