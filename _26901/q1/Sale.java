import java.time.LocalDate;

class Sale extends Purchase {
    private final LocalDate saleDate;
    private final int soldQuantity;   // > 0
    private final String customerName;

    public Sale(int id, LocalDate createdDate, LocalDate updatedDate,
                String warehouseName, String location, String contactNumber,
                String categoryName, String categoryCode,
                String supplierName, String supplierEmail, String supplierPhone,
                String productName, double unitPrice, int stockLimit,
                int quantityAvailable, int reorderLevel,
                LocalDate purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                LocalDate saleDate, int soldQuantity, String customerName) {
        super(id, createdDate, updatedDate,
                warehouseName, location, contactNumber,
                categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit,
                quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, purchaseSupplierName);
        require(saleDate != null, "saleDate must not be null");
        require(soldQuantity > 0, "soldQuantity must be > 0");
        require(customerName != null && !customerName.isBlank(), "customerName required");
        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public String getCustomerName() {
        return customerName;
    }
}