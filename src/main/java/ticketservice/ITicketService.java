package ticketservice;

import ticketservice.model.Ticket;

public interface ITicketService
{
    public void accountReady(String accountId);
    public String routeAccount();
    public Ticket newTalk(String accountId, String customerId, String channelType);
}
