import java.time.LocalDate;

class Warehouse extends Entity {
    private final String warehouseName;
    private final String location;
    private final String contactNumber; // 10 digits

    public Warehouse(int id, LocalDate createdDate, LocalDate updatedDate,
                     String warehouseName, String location, String contactNumber) {
        super(id, createdDate, updatedDate);
        require(warehouseName != null && !warehouseName.isBlank(), "warehouseName required");
        require(location != null && !location.isBlank(), "location required");
        require(contactNumber != null && contactNumber.matches("\\d{10}"),
                "contactNumber must be 10 digits");
        this.warehouseName = warehouseName;
        this.location = location;
        this.contactNumber = contactNumber;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public String getLocation() {
        return location;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}