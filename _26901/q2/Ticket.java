package _26901.q2;

import java.time.LocalDate;

public final class Ticket extends Payment {

    private String ticketNumber;
    private LocalDate issueDate;

    public Ticket(long id, String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare,
                  String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift,
                  String passengerName, int age, String gender, String contact,
                  LocalDate bookingDate, String seatNumber, String travelClass,
                  String paymentMethod, double amountPaid,
                  String ticketNumber, LocalDate issueDate) {

        super(id, airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact,
                bookingDate, seatNumber, travelClass,
                paymentMethod, amountPaid);

        if (ticketNumber == null || ticketNumber.isBlank())
            throw new IllegalArgumentException("Ticket number cannot be empty");

        if (issueDate == null)
            throw new IllegalArgumentException("Issue date cannot be null");

        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

  
    public double calculateFare() {
        double taxes = 50.0;
        double discount = 0.0;
        return getBaseFare() + taxes - discount;
    }

    // ---------------------------------------------------------
    //                 MAIN METHOD (Runner)
    // ---------------------------------------------------------

    public static void main(String[] args) {

        Ticket ticket = new Ticket(
                1,
                "Kigali International", "KGL", "Kigali",

                "RwandaAir", "RWA", "info@rwandair.com",

                "WB102", "Kigali", "Nairobi", 250.0,

                "John Pilot", "LIC12345", 5,

                "Alice Crew", "Attendant", "Day",

                "Claude Nz", 23, "Male", "0788123456",

                LocalDate.now(), "12A", "Economy",

                "Credit Card", 300.0,

                "TCK123456", LocalDate.now()
        );

        Out.print("Ticket Created Successfully!");
        Out.print("Passenger: " + ticket.getPassengerName());
        Out.print("Flight: " + ticket.getFlightNumber());
        Out.print("Fare: " + ticket.calculateFare());
    }
}
