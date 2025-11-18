import java.time.LocalDate;

class Purchase extends StockItem {
    private final LocalDate purchaseDate;
    private final int purchasedQuantity;   // > 0
    private final String purchaseSupplierName;

    public Purchase(int id, LocalDate createdDate, LocalDate updatedDate,
                    String warehouseName, String location, String contactNumber,
                    String categoryName, String categoryCode,
                    String supplierName, String supplierEmail, String supplierPhone,
                    String productName, double unitPrice, int stockLimit,
                    int quantityAvailable, int reorderLevel,
                    LocalDate purchaseDate, int purchasedQuantity, String purchaseSupplierName) {
        super(id, createdDate, updatedDate,
                warehouseName, location, contactNumber,
                categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit,
                quantityAvailable, reorderLevel);
        require(purchaseDate != null, "purchaseDate must not be null");
        require(purchasedQuantity > 0, "purchasedQuantity must be > 0");
        require(purchaseSupplierName != null && !purchaseSupplierName.isBlank(),
                "purchaseSupplierName required");
        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.purchaseSupplierName = purchaseSupplierName;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public String getPurchaseSupplierName() {
        return purchaseSupplierName;
    }
}