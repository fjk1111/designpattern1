package ticketservice.account;

import ticketservice.centerEnv.IEnvService;
import ticketservice.model.Account;

public class AccountService implements IAccountService
{
    IEnvService envService = null;
    public void setAccountPropertyService(IAccountPropertyService accountPropertyService)
    {

    }

    public Account createAccount(Account account)
    {
        System.out.println("상담사 생성 성공!");
        return account;
    }
}
