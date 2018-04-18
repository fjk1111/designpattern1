package ticketservice.account;

import ticketservice.centerEnv.IEnvService;
import ticketservice.model.Account;

public interface IAccountService
{
    void setAccountPropertyService(IAccountPropertyService accountPropertyService);
    public Account createAccount(Account account);
}
