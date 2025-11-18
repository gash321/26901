import java.time.LocalDate;

class Inventory extends Sale {
    private final int totalItems;     // >= 0
    private final double stockValue;  // >= 0

    public Inventory(int id, LocalDate createdDate, LocalDate updatedDate,
                     String warehouseName, String location, String contactNumber,
                     String categoryName, String categoryCode,
                     String supplierName, String supplierEmail, String supplierPhone,
                     String productName, double unitPrice, int stockLimit,
                     int quantityAvailable, int reorderLevel,
                     LocalDate purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                     LocalDate saleDate, int soldQuantity, String customerName,
                     int totalItems, double stockValue) {
        super(id, createdDate, updatedDate,
                warehouseName, location, contactNumber,
                categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit,
                quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, purchaseSupplierName,
                saleDate, soldQuantity, customerName);
        require(totalItems >= 0, "totalItems must be >= 0");
        require(stockValue >= 0, "stockValue must be >= 0");
        this.totalItems = totalItems;
        this.stockValue = stockValue;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public double getStockValue() {
        return stockValue;
    }
}