package controllers;

import dtos.IssueTicketRequestDTO;
import dtos.IssueTicketResponseDTO;
import dtos.ResponseStatus;
import models.Ticket;
import services.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request) {
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();
        try {
            Ticket ticket = ticketService.issueTicket(request.getOwnerName(), request.getVehicleNumber(), request.getVehicleType(), request.getGateid(), request.getParkingLotId());
            response.setTicket(ticket);
            response.setMessage("Successfully created a ticket!");
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setMessage(e.getMessage());
        }
        return response;
    }
}
