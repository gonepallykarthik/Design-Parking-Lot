package strategies;

import models.ParkingLot;
import models.ParkingSlot;
import models.Vehicle_Type;

import java.util.Optional;

public interface SlotAssignStrategies {
    public Optional<ParkingSlot> assignSlot(ParkingLot parkingLot, Vehicle_Type vehicleType);
}
