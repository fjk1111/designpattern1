import message.Message;
import message.Text;

public class Talking
{
    static public void main(String args[])
    {
        Ticket ticket = new Ticket();
        ticket.start();

        Message message = new Text("안녕하세요!!!!");
        message.send("고객");

        message = new Text("네 고갱님");
        message.send("상담사");

        ticket.stop();
    }
}
