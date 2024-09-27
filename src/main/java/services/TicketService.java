package services;

import models.*;
import repositories.GateRepository;
import repositories.ParkingLotRepository;
import repositories.TicketRepository;
import repositories.VehicleRepository;
import strategies.SlotAssignStrategies;
import strategies.SlotAssignStrategyFactory;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;
    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }
    public Ticket issueTicket(String ownerName, String vehicleNumber, Vehicle_Type vehicleType, int gateId, int parkingLotId) {

//        1. get corresponding gate object
        Optional<Gate> gateOptional = gateRepository.findGateById(gateId);
        if(gateOptional.isEmpty()) {
            throw new RuntimeException("Gate not Found! ");
        }
        Gate gate = gateOptional.get();
//        2. get the corresponding vehicle object
        Optional<Vehicle> vehicleOptional = vehicleRepository.getVehicleByNumber(vehicleNumber);
        Vehicle vehicle = null;
        if(vehicleOptional.isEmpty()) {
            vehicle = new Vehicle();
            vehicle.setLicenseNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwner(ownerName);
            vehicle = vehicleRepository.save(vehicle);
        }
//        3. If vehicle Object is not there create One
        else {
            vehicle = vehicleOptional.get();
        }
        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.findById(parkingLotId);
        if(parkingLotOptional.isEmpty()) {
            throw new RuntimeException("Parking Lot not Found !");
        }

//        4. Assign slot
        ParkingLot parkingLot = parkingLotOptional.get();
        SlotAssignStrategies slot = SlotAssignStrategyFactory.getSlotAssignStrategyByType(parkingLot.getSlotAssignStrategyType());
        Optional<ParkingSlot> assignedSlot = slot.assignSlot(parkingLot, vehicleType);

        if(assignedSlot.isEmpty()) {
            throw new RuntimeException("No ParkingSlot Found!");
        }

//        5. ticket object creation
        Ticket ticket = new Ticket();
        ticket.setGate(gate);
        ticket.setSlot(assignedSlot.get());
        ticket.setEntryTime(new Date());
        ticket.setVehicle(vehicle);
        ticket.setOperator(gate.getOperator());

//        6. save ticket to database
        ticket = ticketRepository.save(ticket);

        return ticket;
    }
}
