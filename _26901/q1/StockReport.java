import java.time.LocalDate;

final class StockReport extends Inventory {
    private final LocalDate reportDate;
    private final String remarks;

    public StockReport(int id, LocalDate createdDate, LocalDate updatedDate,
                       String warehouseName, String location, String contactNumber,
                       String categoryName, String categoryCode,
                       String supplierName, String supplierEmail, String supplierPhone,
                       String productName, double unitPrice, int stockLimit,
                       int quantityAvailable, int reorderLevel,
                       LocalDate purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                       LocalDate saleDate, int soldQuantity, String customerName,
                       int totalItems, double stockValue,
                       LocalDate reportDate, String remarks) {
        super(id, createdDate, updatedDate,
                warehouseName, location, contactNumber,
                categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit,
                quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, purchaseSupplierName,
                saleDate, soldQuantity, customerName,
                totalItems, stockValue);
        require(reportDate != null, "reportDate must not be null");
        this.reportDate = reportDate;
        this.remarks = remarks;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public String getRemarks() {
        return remarks;
    }

    // Required method: summarize total stock and sales
    public void generateReport() {
        double totalSalesValue = getSoldQuantity() * getUnitPrice();
        System.out.println("26901 " + "========== STOCK REPORT ==========");
        System.out.println("26901 " + "Report Date : " + reportDate);
        System.out.println("26901 " + "Warehouse   : " + getWarehouseName() + " (" + getLocation() + ")");
        System.out.println("26901 " + "Product     : " + getProductName());
        System.out.println("26901 " + "----------------------------------");
        System.out.println("26901 " + "Total Items in Inventory : " + getTotalItems());
        System.out.println("26901 " + "Total Stock Value        : " + getStockValue());
        System.out.println("26901 " + "Last Sale Date           : " + getSaleDate());
        System.out.println("26901 " + "Last Sold Quantity       : " + getSoldQuantity());
        System.out.println("26901 " + "Total Sales Value        : " + totalSalesValue);
        System.out.println("26901 " + "----------------------------------");
        System.out.println("26901 " + "Remarks: " + (remarks == null ? "-" : remarks));
        System.out.println("26901 " + "==================================");
    }
}