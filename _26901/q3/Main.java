package _26901.q3;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("TAS, Student ID: 26901\n");

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Authority Name: ");
            String authorityName = scanner.nextLine();

            System.out.print("Enter Region: ");
            String region = scanner.nextLine();

            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            System.out.print("Enter Category Name: ");
            String categoryName = scanner.nextLine();

            System.out.print("Enter Tax Rate: ");
            double rate = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter Code (min 3 chars): ");
            String code = scanner.nextLine();

            System.out.print("Enter Taxpayer TIN (9 digits): ");
            String tin = scanner.nextLine();

            System.out.print("Enter Taxpayer Name: ");
            String taxpayerName = scanner.nextLine();

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            System.out.print("Enter Employer Name: ");
            String employerName = scanner.nextLine();

            System.out.print("Enter Employer TIN (9 digits): ");
            String employerTIN = scanner.nextLine();

            System.out.print("Enter Contact (10 digits): ");
            String contact = scanner.nextLine();

            System.out.print("Enter Employee Name: ");
            String employeeName = scanner.nextLine();

            System.out.print("Enter Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter Employee TIN (9 digits): ");
            String employeeTIN = scanner.nextLine();

            System.out.print("Enter Declaration Month: ");
            String declarationMonth = scanner.nextLine();

            System.out.print("Enter Total Income: ");
            double totalIncome = scanner.nextDouble();

            System.out.print("Enter Assessed Tax: ");
            double assessedTax = scanner.nextDouble();

            System.out.print("Enter Payment Amount: ");
            double paymentAmount = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter Receipt Number: ");
            String receiptNo = scanner.nextLine();

            System.out.print("Enter Total Tax: ");
            double totalTax = scanner.nextDouble();

            LocalDate today = LocalDate.now();

            TaxRecord record = new TaxRecord(id, today, today,
                    authorityName, region, email,
                    categoryName, rate, code,
                    tin, taxpayerName, address,
                    employerName, employerTIN, contact,
                    employeeName, salary, employeeTIN,
                    declarationMonth, totalIncome,
                    today, assessedTax,
                    today, paymentAmount,
                    receiptNo, totalTax);

            record.displayTaxRecord();

        } catch (TaxDataException e) {
            System.out.println("Tax Error: " + e.getMessage() + " - Student ID: 26901");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage() + " - Student ID: 26901");
        } finally {
            scanner.close();
        }
    }
}