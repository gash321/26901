package _26901.q2;

public class Pilot extends Flight {

    private String pilotName;
    private String licenseNumber;
    private int experienceYears;

    public Pilot(long id, String airportName, String code, String location,
                 String airlineName, String airlineCode, String contactEmail,
                 String flightNumber, String departure, String destination, double baseFare,
                 String pilotName, String licenseNumber, int experienceYears) {

        super(id, airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare);

        if (pilotName == null || pilotName.isBlank())
            throw new IllegalArgumentException("Pilot name cannot be empty");

        if (licenseNumber == null || licenseNumber.isBlank())
            throw new IllegalArgumentException("License cannot be empty");

        if (experienceYears < 2)
            throw new IllegalArgumentException("Experience must be ≥ 2 years");

        this.pilotName = pilotName;
        this.licenseNumber = licenseNumber;
        this.experienceYears = experienceYears;
    }

    public String getPilotName() { return pilotName; }
    public String getLicenseNumber() { return licenseNumber; }
    public int getExperienceYears() { return experienceYears; }
}
