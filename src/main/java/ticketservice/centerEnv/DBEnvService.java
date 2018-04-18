package ticketservice.centerEnv;

public class DBEnvService implements IEnvService
{
    public void doSave()
    {
        System.out.println("DB save");
    }

    public void doLoad()
    {
        System.out.println("DB load");
    }
}
