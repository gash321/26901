package _26901.q4;

import java.time.LocalDate;

public final class ProcurementReport extends Invoice {
    private LocalDate reportDate;
    private String summary;

    public ProcurementReport(int id, LocalDate createdDate, LocalDate updatedDate,
                             String orgName, String address, String contactEmail,
                             String deptName, String deptCode,
                             String supplierName, String supplierTIN, String contact,
                             String productName, double unitPrice, int quantity,
                             String poNumber, LocalDate orderDate, double totalAmount,
                             LocalDate deliveryDate, String deliveredBy,
                             String inspectorName, String status, String remarks,
                             String invoiceNo, double invoiceAmount,
                             LocalDate reportDate, String summary) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail,
                deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity, poNumber, orderDate, totalAmount,
                deliveryDate, deliveredBy, inspectorName, status, remarks,
                invoiceNo, invoiceAmount);
        this.reportDate = reportDate;
        this.summary = summary;
    }

    public LocalDate getReportDate() { return reportDate; }
    public String getSummary() { return summary; }

    public double calculateTotal() {
        return getInvoiceAmount();
    }

    public void displayReport() {
        System.out.println("\n========================================");
        System.out.println(" REPORT - 26901");
        System.out.println("========================================");
        System.out.println("Report Date: " + reportDate);
        System.out.println("----------------------------------------");
        System.out.println("Organization: " + getOrgName());
        System.out.println("Address: " + getAddress());
        System.out.println("Email: " + getContactEmail());
        System.out.println("----------------------------------------");
        System.out.println("Department: " + getDeptName());
        System.out.println("Dept Code: " + getDeptCode());
        System.out.println("----------------------------------------");
        System.out.println("Supplier: " + getSupplierName());
        System.out.println("Supplier TIN: " + getSupplierTIN());
        System.out.println("Contact: " + getContact());
        System.out.println("----------------------------------------");
        System.out.println("Product: " + getProductName());
        System.out.println("Unit Price: RWF " + getUnitPrice());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("----------------------------------------");
        System.out.println("PO Number: " + getPoNumber());
        System.out.println("Order Date: " + getOrderDate());
        System.out.println("Total Amount: RWF " + getTotalAmount());
        System.out.println("----------------------------------------");
        System.out.println("Delivery Date: " + getDeliveryDate());
        System.out.println("Delivered By: " + getDeliveredBy());
        System.out.println("----------------------------------------");
        System.out.println("Inspector: " + getInspectorName());
        System.out.println("Status: " + getStatus());
        System.out.println("Remarks: " + getRemarks());
        System.out.println("----------------------------------------");
        System.out.println("Invoice No: " + getInvoiceNo());
        System.out.println("Invoice Amount: RWF " + getInvoiceAmount());
        System.out.println("----------------------------------------");
        System.out.println("CALCULATED TOTAL: RWF " + calculateTotal());
        System.out.println("Summary: " + summary);
        System.out.println("ID: 26901");
        System.out.println("========================================\n");
    }
}