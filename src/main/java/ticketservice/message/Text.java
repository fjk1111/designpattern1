package ticketservice.message;

public class Text implements Message
{
    String contents = "";
    public String getContents()
    {
        return "텍스트 메시지 전송 : " + this.contents;
    }

    public void setContents(String contents)
    {
        this.contents = contents;
    }
}
