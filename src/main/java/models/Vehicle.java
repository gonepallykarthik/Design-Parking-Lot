package models;

public class Vehicle extends BaseModel{
    private String licenseNumber;
    private String owner;
    private Vehicle_Type vehicleType;


    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Vehicle_Type getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicle_Type vehicleType) {
        this.vehicleType = vehicleType;
    }
}
