package repositories;

import models.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class ParkingLotRepository {
    private Map<Integer, ParkingLot> parkingLotMap = new TreeMap<>();

    public ParkingLotRepository() {
        ParkingLot parkingLot = new ParkingLot();
        ParkingFloor parkingFloor = new ParkingFloor();
        ParkingSlot parkingSlot = new ParkingSlot();

        // parking slot
        parkingSlot.setSlotNumber(1);
        parkingSlot.setVehicleType(Vehicle_Type.CAR);

        // parking floor
        parkingFloor.setFloorNumber(1);
        parkingFloor.setVehicleSupported(Vehicle_Supported.CAR);
        List<ParkingSlot> slots = parkingFloor.getSlot();
        slots.add(parkingSlot);
        parkingFloor.setSlot(slots);

        // parking lot
        parkingLot.setId(1);
        parkingLot.setSlotAssignStrategyType(SlotAssignStrategyType.RANDOM);
        List<ParkingFloor> floors = parkingLot.getFloors();
        floors.add(parkingFloor);
        parkingLot.setFloors(floors);

        parkingLotMap.put(parkingLot.getId(), parkingLot);
    }

    public Optional<ParkingLot> findById(int id) {
        if (parkingLotMap.containsKey(id)) {
            return Optional.of(parkingLotMap.get(id));
        }
        return Optional.empty();
    }
}
