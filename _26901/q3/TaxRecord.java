package _26901.q3;

import java.time.LocalDate;

public final class TaxRecord extends Payment {
    private String receiptNo;
    private double totalTax;

    public TaxRecord(int id, LocalDate createdDate, LocalDate updatedDate,
                     String authorityName, String region, String email,
                     String categoryName, double rate, String code,
                     String tin, String taxpayerName, String address,
                     String employerName, String employerTIN, String contact,
                     String employeeName, double salary, String employeeTIN,
                     String declarationMonth, double totalIncome,
                     LocalDate assessmentDate, double assessedTax,
                     LocalDate paymentDate, double paymentAmount,
                     String receiptNo, double totalTax) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
                tin, taxpayerName, address, employerName, employerTIN, contact,
                employeeName, salary, employeeTIN, declarationMonth, totalIncome,
                assessmentDate, assessedTax, paymentDate, paymentAmount);
        this.receiptNo = receiptNo;
        this.totalTax = totalTax;
    }

    public String getReceiptNo() { return receiptNo; }
    public double getTotalTax() { return totalTax; }

    public double computeTax() {
        double credits = 0;
        if (getSalary() < 100000) {
            credits = 5000;
        }
        return (getSalary() * getRate() / 100) - credits;
    }

    public void displayTaxRecord() {
        System.out.println("\n========================================");
        System.out.println("  26901");
        System.out.println("========================================");
        System.out.println("Receipt No: " + receiptNo);
        System.out.println("----------------------------------------");
        System.out.println("Tax Authority: " + getAuthorityName());
        System.out.println("Region: " + getRegion());
        System.out.println("Email: " + getEmail());
        System.out.println("----------------------------------------");
        System.out.println("Category: " + getCategoryName());
        System.out.println("Tax Rate: " + getRate() + "%");
        System.out.println("Code: " + getCode());
        System.out.println("----------------------------------------");
        System.out.println("Taxpayer: " + getTaxpayerName());
        System.out.println("TIN: " + getTin());
        System.out.println("Address: " + getAddress());
        System.out.println("----------------------------------------");
        System.out.println("Employer: " + getEmployerName());
        System.out.println("Employer TIN: " + getEmployerTIN());
        System.out.println("Contact: " + getContact());
        System.out.println("----------------------------------------");
        System.out.println("Employee: " + getEmployeeName());
        System.out.println("Employee TIN: " + getEmployeeTIN());
        System.out.println("Salary: RWF " + getSalary());
        System.out.println("----------------------------------------");
        System.out.println("Declaration Month: " + getDeclarationMonth());
        System.out.println("Total Income: RWF " + getTotalIncome());
        System.out.println("Assessment Date: " + getAssessmentDate());
        System.out.println("Assessed Tax: RWF " + getAssessedTax());
        System.out.println("----------------------------------------");
        System.out.println("Payment Date: " + getPaymentDate());
        System.out.println("Payment Amount: RWF " + getPaymentAmount());
        System.out.println("----------------------------------------");
        System.out.println("COMPUTED TAX: RWF " + String.format("%.2f", computeTax()));
        System.out.println("Total Tax: RWF " + totalTax);
        System.out.println("Student ID: 26901");
        System.out.println("========================================\n");
    }
}