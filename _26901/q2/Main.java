package _26901.q2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Out.print("Ticket Creator");

            Out.print("id (numeric): ");
            long id = parseLong(in.nextLine().trim(), 1L);

            Out.print("Airport name: ");
            String airportName = in.nextLine().trim();

            Out.print("Airport code: ");
            String code = in.nextLine().trim();

            Out.print("Airport location: ");
            String location = in.nextLine().trim();

            Out.print("Airline name: ");
            String airlineName = in.nextLine().trim();

            Out.print("Airline code: ");
            String airlineCode = in.nextLine().trim();

            Out.print("Airline contact email: ");
            String contactEmail = in.nextLine().trim();

            Out.print("Flight number: ");
            String flightNumber = in.nextLine().trim();

            Out.print("Departure: ");
            String departure = in.nextLine().trim();

            Out.print("Destination: ");
            String destination = in.nextLine().trim();

            Out.print("Base fare (numeric): ");
            double baseFare = parseDouble(in.nextLine().trim(), 100.0);

            Out.print("Pilot name: ");
            String pilotName = in.nextLine().trim();

            Out.print("Pilot license number: ");
            String licenseNumber = in.nextLine().trim();

            Out.print("Pilot experience years (int): ");
            int experienceYears = (int) parseLong(in.nextLine().trim(), 2);

            Out.print("Crew name: ");
            String crewName = in.nextLine().trim();

            Out.print("Crew role: ");
            String role = in.nextLine().trim();

            Out.print("Shift (Day/Night): ");
            String shift = in.nextLine().trim();

            Out.print("Passenger name: ");
            String passengerName = in.nextLine().trim();

            Out.print("Passenger age (int): ");
            int age = (int) parseLong(in.nextLine().trim(), 18);

            Out.print("Passenger gender (Male/Female): ");
            String gender = in.nextLine().trim();

            Out.print("Passenger contact: ");
            String contact = in.nextLine().trim();

            LocalDate bookingDate = LocalDate.now();

            Out.print("Seat number: ");
            String seatNumber = in.nextLine().trim();

            Out.print("Travel class (Economy/Business/First): ");
            String travelClass = in.nextLine().trim();

            Out.print("Payment method: ");
            String paymentMethod = in.nextLine().trim();

            Out.print("Amount paid (numeric): ");
            double amountPaid = parseDouble(in.nextLine().trim(), baseFare);

            Out.print("Ticket number: ");
            String ticketNumber = in.nextLine().trim();

            LocalDate issueDate = LocalDate.now();

            Ticket ticket = new Ticket(
                    id,
                    airportName, code, location,
                    airlineName, airlineCode, contactEmail,
                    flightNumber, departure, destination, baseFare,
                    pilotName, licenseNumber, experienceYears,
                    crewName, role, shift,
                    passengerName, age, gender, contact,
                    bookingDate, seatNumber, travelClass,
                    paymentMethod, amountPaid,
                    ticketNumber, issueDate
            );

            Out.print("Ticket Created Successfully!");
            Out.print("Passenger: " + ticket.getPassengerName());
            Out.print("Flight: " + ticket.getFlightNumber());
            Out.print("Fare: " + ticket.calculateFare());

        }
    }

    private static long parseLong(String s, long def) {
        if (s == null || s.isBlank()) return def;
        try { return Long.parseLong(s); } catch (NumberFormatException e) { return def; }
    }

    private static double parseDouble(String s, double def) {
        if (s == null || s.isBlank()) return def;
        try { return Double.parseDouble(s); } catch (NumberFormatException e) { return def; }
    }
}
