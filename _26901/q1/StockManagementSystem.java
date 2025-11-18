import java.time.LocalDate;
import java.util.Scanner;

public class StockManagementSystem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                createAndGenerateReport(sc);
            } catch (IllegalArgumentException ex) {
                System.out.println("26901 " + "Validation error: " + ex.getMessage());
            } catch (Exception ex) {
                System.out.println("26901 " + "Unexpected error: " + ex.getMessage());
            }
        }
    }

    private static void createAndGenerateReport(Scanner sc) {
        System.out.print("26901 " + "Enter Entity ID (>0): ");
        int id = Integer.parseInt(sc.nextLine());

        LocalDate today = LocalDate.now();

        System.out.print("26901 " + "Warehouse name: ");
        String warehouseName = sc.nextLine();

        System.out.print("26901 " + "Warehouse location: ");
        String location = sc.nextLine();

        System.out.print("26901 " + "Warehouse contact number (10 digits): ");
        String contactNumber = sc.nextLine();

        System.out.print("26901 " + "Category name: ");
        String categoryName = sc.nextLine();

        System.out.print("26901 " + "Category code (alphanumeric >=3): ");
        String categoryCode = sc.nextLine();

        System.out.print("26901 " + "Supplier name: ");
        String supplierName = sc.nextLine();

        System.out.print("26901 " + "Supplier email: ");
        String supplierEmail = sc.nextLine();

        System.out.print("26901 " + "Supplier phone (10 digits): ");
        String supplierPhone = sc.nextLine();

        System.out.print("26901 " + "Product name: ");
        String productName = sc.nextLine();

        System.out.print("26901 " + "Unit price (>0): ");
        double unitPrice = Double.parseDouble(sc.nextLine());

        System.out.print("26901 " + "Stock limit (>=0): ");
        int stockLimit = Integer.parseInt(sc.nextLine());

        System.out.print("26901 " + "Quantity available (>=0): ");
        int quantityAvailable = Integer.parseInt(sc.nextLine());

        System.out.print("26901 " + "Reorder level (>=0): ");
        int reorderLevel = Integer.parseInt(sc.nextLine());

        System.out.print("26901 " + "Purchased quantity (>0): ");
        int purchasedQuantity = Integer.parseInt(sc.nextLine());

        System.out.print("26901 " + "Purchase supplier name: ");
        String purchaseSupplierName = sc.nextLine();

        System.out.print("26901 " + "Sold quantity (>0): ");
        int soldQuantity = Integer.parseInt(sc.nextLine());

        System.out.print("26901 " + "Customer name: ");
        String customerName = sc.nextLine();

        System.out.print("26901 " + "Total items in inventory (>=0): ");
        int totalItems = Integer.parseInt(sc.nextLine());

        System.out.print("26901 " + "Total stock value (>=0): ");
        double stockValue = Double.parseDouble(sc.nextLine());

        System.out.print("26901 " + "Remarks for report: ");
        String remarks = sc.nextLine();

        
        LocalDate purchaseDate = today;
        LocalDate saleDate = today;
        LocalDate reportDate = today;

        StockReport report = new StockReport(
                id, today, today,
                warehouseName, location, contactNumber,
                categoryName, categoryCode,
                supplierName, supplierEmail, supplierPhone,
                productName, unitPrice, stockLimit,
                quantityAvailable, reorderLevel,
                purchaseDate, purchasedQuantity, purchaseSupplierName,
                saleDate, soldQuantity, customerName,
                totalItems, stockValue,
                reportDate, remarks
        );

        report.generateReport();
    }
}