package models;

import strategies.SlotAssignStrategies;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot extends BaseModel {
    private String name;
    private List<ParkingFloor> floors;
    private List<Vehicle_Supported> supported_vehicle;
    private ParkingLotStatus status;
    private List<Gate> entryGates;
    private List<Gate> exitGates;
    private SlotAssignStrategyType slotAssignStrategyType;

    public ParkingLot(){
        this.name = "My_Parking_slot";
        this.floors = new ArrayList<>();
        this.entryGates = new ArrayList<>();
        this.exitGates = new ArrayList<>();
        this.status = ParkingLotStatus.OPEN;
        this.supported_vehicle = new ArrayList<>();
    }

    public SlotAssignStrategyType getSlotAssignStrategyType() {
        return slotAssignStrategyType;
    }

    public void setSlotAssignStrategyType(SlotAssignStrategyType slotAssignStrategyType) {
        this.slotAssignStrategyType = slotAssignStrategyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public List<Vehicle_Supported> getSupported_vehicle() {
        return supported_vehicle;
    }

    public void setSupported_vehicle(List<Vehicle_Supported> supported_vehicle) {
        this.supported_vehicle = supported_vehicle;
    }

    public ParkingLotStatus getStatus() {
        return status;
    }

    public void setStatus(ParkingLotStatus status) {
        this.status = status;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<Gate> exitGates) {
        this.exitGates = exitGates;
    }
}
