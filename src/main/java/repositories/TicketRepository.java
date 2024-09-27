package repositories;

import models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {
    private Map<Integer, Ticket> tickets = new TreeMap<>();
    private static int previousId = 0;

    public Ticket save(Ticket ticket) {
        previousId++;
        ticket.setId(previousId);
        ticket.setTicketNumber("Ticket# " + previousId);
        tickets.put(ticket.getId(), ticket);
        return ticket;
    }
}
