package _26901.q2;

public class Airport extends Entity {

    private String airportName;
    private String code;
    private String location;

    public Airport(long id, String airportName, String code, String location) {
        super(id);

        if (airportName == null || airportName.isBlank())
            throw new IllegalArgumentException("Airport name cannot be empty");

        if (!code.matches("[A-Z]{3}"))
            throw new IllegalArgumentException("Airport code must be 3 uppercase letters");

        if (location == null || location.isBlank())
            throw new IllegalArgumentException("Location cannot be empty");

        this.airportName = airportName;
        this.code = code;
        this.location = location;
    }

    public String getAirportName() { return airportName; }
    public String getCode() { return code; }
    public String getLocation() { return location; }
}
