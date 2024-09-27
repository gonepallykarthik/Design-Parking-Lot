package strategies;

import models.ParkingLot;
import models.ParkingSlot;
import models.Vehicle_Type;

import java.util.Optional;

public class NearestSlot implements SlotAssignStrategies{
    @Override
    public Optional<ParkingSlot> assignSlot(ParkingLot parkingLot, Vehicle_Type vehicleType) {
        return null;
    }
}
