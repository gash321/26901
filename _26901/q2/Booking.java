package _26901.q2;

import java.time.LocalDate;

public class Booking extends Passenger {

    private LocalDate bookingDate;
    private String seatNumber;
    private String travelClass;

    public Booking(long id, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   LocalDate bookingDate, String seatNumber, String travelClass) {

        super(id, airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact);

        if (bookingDate == null)
            throw new IllegalArgumentException("Booking date cannot be null");

        if (seatNumber == null || seatNumber.isBlank())
            throw new IllegalArgumentException("Seat number cannot be empty");

        if (!travelClass.equals("Economy") &&
            !travelClass.equals("Business") &&
            !travelClass.equals("First"))
            throw new IllegalArgumentException("Class must be Economy, Business, or First");

        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.travelClass = travelClass;
    }

    public LocalDate getBookingDate() { return bookingDate; }
    public String getSeatNumber() { return seatNumber; }
    public String getTravelClass() { return travelClass; }
}
