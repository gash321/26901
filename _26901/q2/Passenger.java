package _26901.q2;

public class Passenger extends CabinCrew {

    private String passengerName;
    private int age;
    private String gender;
    private String contact;

    public Passenger(long id, String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift,
                     String passengerName, int age, String gender, String contact) {

        super(id, airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift);

        if (passengerName == null || passengerName.isBlank())
            throw new IllegalArgumentException("Passenger name cannot be empty");

        if (age <= 0)
            throw new IllegalArgumentException("Age must be > 0");

        if (!gender.equals("Male") && !gender.equals("Female"))
            throw new IllegalArgumentException("Gender must be Male or Female");

        if (contact == null || contact.isBlank())
            throw new IllegalArgumentException("Contact cannot be empty");

        this.passengerName = passengerName;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }

    public String getPassengerName() { return passengerName; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public String getContact() { return contact; }
}
