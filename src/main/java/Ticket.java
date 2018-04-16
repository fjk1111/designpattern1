import message.Message;

public class Ticket
{
    String ticketStatus;

    public void start()
    {
        System.out.println("상담시작");
        this.ticketStatus = "start";
    }

    public void stop()
    {
        System.out.print("상담종료");
        this.ticketStatus = "end";
    }
}
