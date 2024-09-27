package strategies;

import models.*;

import java.util.List;
import java.util.Optional;

public class RandomSlot implements SlotAssignStrategies{
    @Override
    public Optional<ParkingSlot> assignSlot(ParkingLot parkingLot, Vehicle_Type vehicleType) {
        for (ParkingFloor floors : parkingLot.getFloors()) {
            for (ParkingSlot slot : floors.getSlot()) {
                if (slot.getStatus().equals(slotStatus.EMPTY) && slot.getVehicleType().equals(vehicleType)) {
                    return Optional.of(slot);
                }
            }
        }

        return Optional.empty();
    }
}
