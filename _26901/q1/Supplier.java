import java.time.LocalDate;

class Supplier extends Category {
    private final String supplierName;
    private final String supplierEmail;
    private final String supplierPhone; // 10 digits

    public Supplier(int id, LocalDate createdDate, LocalDate updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode);
        require(supplierName != null && !supplierName.isBlank(), "supplierName required");
        require(isValidEmail(supplierEmail), "Invalid email");
        require(supplierPhone != null && supplierPhone.matches("\\d{10}"),
                "supplierPhone must be 10 digits");
        this.supplierName = supplierName;
        this.supplierEmail = supplierEmail;
        this.supplierPhone = supplierPhone;
    }

    private static boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getSupplierEmail() {
        return supplierEmail;
    }

    public String getSupplierPhone() {
        return supplierPhone;
    }
}