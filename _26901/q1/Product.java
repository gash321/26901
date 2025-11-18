import java.time.LocalDate;

class Product extends Supplier {
    private final String productName;
    private final double unitPrice;  // > 0
    private final int stockLimit;    // >= 0

    public Product(int id, LocalDate createdDate, LocalDate updatedDate,
                   String warehouseName, String location, String contactNumber,
                   String categoryName, String categoryCode,
                   String supplierName, String supplierEmail, String supplierPhone,
                   String productName, double unitPrice, int stockLimit) {
        super(id, createdDate, updatedDate, warehouseName, location, contactNumber,
                categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone);
        require(productName != null && !productName.isBlank(), "productName required");
        require(unitPrice > 0, "unitPrice must be > 0");
        require(stockLimit >= 0, "stockLimit must be >= 0");
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stockLimit = stockLimit;
    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getStockLimit() {
        return stockLimit;
    }
}