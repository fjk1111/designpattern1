package ticketservice.account;

public interface IAccountPropertyService
{
    public void setProperty(String key, String value);
    public String getProperty(String key);
}
