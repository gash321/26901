package _26901.q4;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("=== PMS - Student ID:26901  ===\n");

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Organization Name: ");
            String orgName = scanner.nextLine();

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            System.out.print("Enter Contact Email: ");
            String contactEmail = scanner.nextLine();

            System.out.print("Enter Department Name: ");
            String deptName = scanner.nextLine();

            System.out.print("Enter Department Code (alphanumeric, min 3 chars): ");
            String deptCode = scanner.nextLine();

            System.out.print("Enter Supplier Name: ");
            String supplierName = scanner.nextLine();

            System.out.print("Enter Supplier TIN (9 digits): ");
            String supplierTIN = scanner.nextLine();

            System.out.print("Enter Contact (10 digits): ");
            String contact = scanner.nextLine();

            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();

            System.out.print("Enter Unit Price: ");
            double unitPrice = scanner.nextDouble();

            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter PO Number: ");
            String poNumber = scanner.nextLine();

            System.out.print("Enter Total Amount: ");
            double totalAmount = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter Delivered By: ");
            String deliveredBy = scanner.nextLine();

            System.out.print("Enter Inspector Name: ");
            String inspectorName = scanner.nextLine();

            System.out.print("Enter Status (Passed/Failed): ");
            String status = scanner.nextLine();

            System.out.print("Enter Remarks: ");
            String remarks = scanner.nextLine();

            System.out.print("Enter Invoice Number: ");
            String invoiceNo = scanner.nextLine();

            System.out.print("Enter Invoice Amount: ");
            double invoiceAmount = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter Summary: ");
            String summary = scanner.nextLine();

            LocalDate today = LocalDate.now();

            ProcurementReport report = new ProcurementReport(id, today, today,
                    orgName, address, contactEmail,
                    deptName, deptCode,
                    supplierName, supplierTIN, contact,
                    productName, unitPrice, quantity,
                    poNumber, today, totalAmount,
                    today, deliveredBy,
                    inspectorName, status, remarks,
                    invoiceNo, invoiceAmount,
                    today, summary);

            report.displayReport();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage() + " - Student ID: 26901");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage() + " - Student ID: 26901");
        } finally {
            scanner.close();
        }
    }
}