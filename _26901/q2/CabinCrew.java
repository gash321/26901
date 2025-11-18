package _26901.q2;

public class CabinCrew extends Pilot {

    private String crewName;
    private String role;
    private String shift;

    public CabinCrew(long id, String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift) {

        super(id, airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears);

        if (crewName == null || crewName.isBlank())
            throw new IllegalArgumentException("Crew name cannot be empty");

        if (role == null || role.isBlank())
            throw new IllegalArgumentException("Role cannot be empty");

        if (!shift.equals("Day") && !shift.equals("Night"))
            throw new IllegalArgumentException("Shift must be 'Day' or 'Night'");

        this.crewName = crewName;
        this.role = role;
        this.shift = shift;
    }

    public String getCrewName() { return crewName; }
    public String getRole() { return role; }
    public String getShift() { return shift; }
}
