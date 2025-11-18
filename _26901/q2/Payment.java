package _26901.q2;

public class Payment extends Booking {

    private String paymentMethod;
    private double amountPaid;

    public Payment(long id, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   java.time.LocalDate bookingDate, String seatNumber, String travelClass,
                   String paymentMethod, double amountPaid) {

        super(id, airportName, code, location,
                airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare,
                pilotName, licenseNumber, experienceYears,
                crewName, role, shift,
                passengerName, age, gender, contact,
                bookingDate, seatNumber, travelClass);

        if (paymentMethod == null || paymentMethod.isBlank())
            throw new IllegalArgumentException("Payment method cannot be empty");

        if (amountPaid <= 0)
            throw new IllegalArgumentException("Amount must be > 0");

        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
    }

    public String getPaymentMethod() { return paymentMethod; }
    public double getAmountPaid() { return amountPaid; }

    public String getPassengerName() {
        return super.getPassengerName();
}

public String getFlightNumber() {
        return super.getFlightNumber();
}

public String getAirlineName() {
        return super.getAirlineName();
}



public String getSeatNumber() {
        return super.getSeatNumber();
}

}
