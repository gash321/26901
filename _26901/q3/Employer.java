package _26901.q3;

import java.time.LocalDate;

public class Employer extends Taxpayer {
    private String employerName;
    private String employerTIN;
    private String contact;

    public Employer(int id, LocalDate createdDate, LocalDate updatedDate,
                    String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact) throws TaxDataException {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code,
                tin, taxpayerName, address);
        if (employerTIN == null || employerTIN.length() != 9 || !employerTIN.matches("\\d{9}")) {
            throw new TaxDataException("Employer TIN must be exactly 9 digits");
        }
        if (contact == null || contact.length() != 10 || !contact.matches("\\d{10}")) {
            throw new TaxDataException("Contact must be exactly 10 digits");
        }
        this.employerName = employerName;
        this.employerTIN = employerTIN;
        this.contact = contact;
    }

    public String getEmployerName() { return employerName; }
    public String getEmployerTIN() { return employerTIN; }
    public String getContact() { return contact; }
}