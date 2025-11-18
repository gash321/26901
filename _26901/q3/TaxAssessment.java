package _26901.q3;

import java.time.LocalDate;

public class TaxAssessment extends TaxDeclaration {
    private LocalDate assessmentDate;
    private double assessedTax;

    public TaxAssessment(int id, LocalDate createdDate, LocalDate updatedDate,
                         String authorityName, String region, String email,
                         String categoryName, double rate, String code,
                         String tin, String taxpayerName, String address,
                         String employerName, String employerTIN, String contact,
                         String employeeName, double salary, String employeeTIN,
                         String declarationMonth, double totalIncome,
                         LocalDate assessmentDate, double assessedTax) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
                tin, taxpayerName, address, employerName, employerTIN, contact,
                employeeName, salary, employeeTIN, declarationMonth, totalIncome);
        if (assessedTax < 0) throw new TaxDataException("Assessed tax cannot be negative");
        this.assessmentDate = assessmentDate;
        this.assessedTax = assessedTax;
    }

    public LocalDate getAssessmentDate() { return assessmentDate; }
    public double getAssessedTax() { return assessedTax; }
}