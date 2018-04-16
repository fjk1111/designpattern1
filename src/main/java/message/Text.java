package message;

public class Text implements Message
{
    String message;
    public Text(String message)
    {
        this.message = message;
    }

    public String send(String sender)
    {
        System.out.println(sender + " 메시지 전송 : " + message);
        return "성공";
    }

    public String receive()
    {
        System.out.println("텍스트 메시지 수신");
        return "성공";
    }
}
