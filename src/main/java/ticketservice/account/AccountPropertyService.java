package ticketservice.account;

import java.util.HashMap;
import java.util.Map;

public class AccountPropertyService implements IAccountPropertyService
{
    Map<String,String> property = new HashMap();
    public void setProperty(String key, String value)
    {
        property.put(key, value);
    }

    public String getProperty(String key)
    {
        return property.get(key);
    }
}
