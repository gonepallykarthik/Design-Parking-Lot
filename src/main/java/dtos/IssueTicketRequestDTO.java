package dtos;

import models.ParkingLot;
import models.Vehicle_Type;

public class IssueTicketRequestDTO {
    private int gateid;
    private String vehicleNumber;
    private Vehicle_Type vehicleType;
    private String ownerName;
    private int parkingLotId;

    public int getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public int getGateid() {
        return gateid;
    }

    public void setGateid(int gateid) {
        this.gateid = gateid;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Vehicle_Type getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicle_Type vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
