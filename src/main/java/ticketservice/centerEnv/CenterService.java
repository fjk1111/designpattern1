package ticketservice.centerEnv;

public class CenterService implements ICenterService
{
    private IEnvService envService;
    private IActionService actionService;
    public void setEnvService(IEnvService envService)
    {
        this.envService = envService;
    }

    public void setActionService(IActionService actionService)
    {
        this.actionService = actionService;
    }

    public void doAction()
    {
        this.actionService.doAction();
        this.envService.doSave();
    }

}