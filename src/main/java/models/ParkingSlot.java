package models;

public class ParkingSlot extends BaseModel{
    private int slotNumber;
    private Vehicle_Type vehicleType;
    private slotStatus status;

    public ParkingSlot() {
        this.status = slotStatus.EMPTY;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public Vehicle_Type getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicle_Type vehicleType) {
        this.vehicleType = vehicleType;
    }

    public slotStatus getStatus() {
        return status;
    }

    public void setStatus(slotStatus status) {
        this.status = status;
    }
}
