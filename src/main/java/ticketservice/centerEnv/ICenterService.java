package ticketservice.centerEnv;

public interface ICenterService
{
    public void doAction();
    void setEnvService(IEnvService envService);
    void setActionService(IActionService actionService);
}
