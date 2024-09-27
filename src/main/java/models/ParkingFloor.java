package models;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor extends BaseModel{
    private int floorNumber;
    private List<ParkingSlot> slot;
    private ParkingLotStatus status;
    private Vehicle_Supported vehicleSupported;

    public ParkingFloor() {
        this.slot = new ArrayList<>();
        this.status = ParkingLotStatus.OPEN;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getSlot() {
        return slot;
    }

    public void setSlot(List<ParkingSlot> slot) {
        this.slot = slot;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }

    public Vehicle_Supported getVehicleSupported() {
        return vehicleSupported;
    }

    public void setVehicleSupported(Vehicle_Supported vehicleSupported) {
        this.vehicleSupported = vehicleSupported;
    }
}
