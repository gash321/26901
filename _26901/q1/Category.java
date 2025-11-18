import java.time.LocalDate;

class Category extends Warehouse {
    private final String categoryName;
    private final String categoryCode; // alphanumeric, >= 3 chars

    public Category(int id, LocalDate createdDate, LocalDate updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber);
        require(categoryName != null && !categoryName.isBlank(), "categoryName required");
        require(categoryCode != null && categoryCode.matches("[A-Za-z0-9]{3,}"),
                "categoryCode must be alphanumeric and at least 3 characters");
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryCode() {
        return categoryCode;
    }
}