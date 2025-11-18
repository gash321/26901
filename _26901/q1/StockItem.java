import java.time.LocalDate;

class StockItem extends Product {
    private final int quantityAvailable; // >= 0
    private final int reorderLevel;      // >= 0

    public StockItem(int id, LocalDate createdDate, LocalDate updatedDate,
                     String warehouseName, String location, String contactNumber,
                     String categoryName, String categoryCode,
                     String supplierName, String supplierEmail, String supplierPhone,
                     String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel) {
        super(id, createdDate, updatedDate,
                warehouseName, location, contactNumber,
                categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit);
        require(quantityAvailable >= 0, "quantityAvailable must be >= 0");
        require(reorderLevel >= 0, "reorderLevel must be >= 0");
        this.quantityAvailable = quantityAvailable;
        this.reorderLevel = reorderLevel;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }
}