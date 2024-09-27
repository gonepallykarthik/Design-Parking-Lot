import controllers.TicketController;
import dtos.IssueTicketRequestDTO;
import dtos.IssueTicketResponseDTO;
import models.Vehicle_Type;
import repositories.GateRepository;
import repositories.ParkingLotRepository;
import repositories.TicketRepository;
import repositories.VehicleRepository;
import services.TicketService;

public class client {
    public static void main(String[] args) {
        System.out.println("welcome");
//        first create repositories
        TicketRepository ticketRepository = new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        GateRepository gateRepository = new GateRepository();

        TicketService ticketService = new TicketService(gateRepository,vehicleRepository,parkingLotRepository,ticketRepository);

        IssueTicketRequestDTO issueTicketRequestDTO = new IssueTicketRequestDTO();
        issueTicketRequestDTO.setGateid(1);
        issueTicketRequestDTO.setOwnerName("adithya");
        issueTicketRequestDTO.setVehicleType(Vehicle_Type.CAR);
        issueTicketRequestDTO.setVehicleNumber("TS08HL4987");
        issueTicketRequestDTO.setParkingLotId(1);

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketResponseDTO issueTicketResponseDTO = ticketController.issueTicket(issueTicketRequestDTO);

        System.out.println(issueTicketResponseDTO.getMessage());
        System.out.println(issueTicketResponseDTO.getResponseStatus());

    }
}
