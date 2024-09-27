package repositories;

import models.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {
    private Map<String, Vehicle> vehicles = new TreeMap<>();
    private static int previousId = 0;
    public Optional<Vehicle> getVehicleByNumber(String licenseNumber) {
        if (vehicles.containsKey(licenseNumber)) {
            return Optional.of(vehicles.get(licenseNumber));
        }

        return Optional.empty();
    }

    public Vehicle save(Vehicle vehicle) {
        previousId++;
        vehicle.setId(previousId);
        String licenseNumber = vehicle.getLicenseNumber();
        vehicles.put(licenseNumber, vehicle);
        return vehicle;
    }
}
