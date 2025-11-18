package _26901.q2;

public class Airline extends Airport {

    private String airlineName;
    private String airlineCode;
    private String contactEmail;

    public Airline(long id, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail) {
        super(id, airportName, code, location);

        if (airlineName == null || airlineName.isBlank())
            throw new IllegalArgumentException("Airline name cannot be empty");

        if (!airlineCode.matches("[A-Za-z]{2,4}"))
            throw new IllegalArgumentException("Airline code must be 2-4 letters");

        if (!contactEmail.matches("^.+@.+\\..+$"))
            throw new IllegalArgumentException("Invalid email format");

        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.contactEmail = contactEmail;
    }

    public String getAirlineName() { return airlineName; }
    public String getAirlineCode() { return airlineCode; }
    public String getContactEmail() { return contactEmail; }
}
