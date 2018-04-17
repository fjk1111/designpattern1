package ticketservice.message;


public class Image implements Message
{
    String contents = "";
    public String getContents()
    {
        return "이미지 메시지 전송 : " + this.contents;
    }

    public void setContents(String contents)
    {
        this.contents = contents;
    }
}
