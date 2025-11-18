package _26901.q5;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("AMS - Student ID: 26901\n");

            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Institution Name: ");
            String institutionName = scanner.nextLine();

            System.out.print("Enter Code (min 3 chars): ");
            String code = scanner.nextLine();

            System.out.print("Enter Address: ");
            String address = scanner.nextLine();

            System.out.print("Enter Department Name: ");
            String departmentName = scanner.nextLine();

            System.out.print("Enter Department Head: ");
            String departmentHead = scanner.nextLine();

            System.out.print("Enter Course Name: ");
            String courseName = scanner.nextLine();

            System.out.print("Enter Course Code: ");
            String courseCode = scanner.nextLine();

            System.out.print("Enter Credits: ");
            int credits = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Instructor Name: ");
            String instructorName = scanner.nextLine();

            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            System.out.print("Enter Phone (10 digits): ");
            String phone = scanner.nextLine();

            System.out.print("Enter Student Name: ");
            String studentName = scanner.nextLine();

            System.out.print("Enter Student ID: ");
            String studentID = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Topic: ");
            String topic = scanner.nextLine();

            System.out.print("Enter Session ID: ");
            String sessionID = scanner.nextLine();

            System.out.print("Enter Status (Present/Absent): ");
            String status = scanner.nextLine();

            System.out.print("Enter Leave Reason: ");
            String reason = scanner.nextLine();

            System.out.print("Is Leave Approved? (true/false): ");
            boolean approved = scanner.nextBoolean();

            System.out.print("Enter Total Present: ");
            int totalPresent = scanner.nextInt();

            System.out.print("Enter Total Absent: ");
            int totalAbsent = scanner.nextInt();

            LocalDate today = LocalDate.now();

            AttendanceSummary summary = new AttendanceSummary(id, today, today,
                    institutionName, code, address,
                    departmentName, departmentHead,
                    courseName, courseCode, credits,
                    instructorName, email, phone,
                    studentName, studentID, age,
                    today, topic,
                    studentID, sessionID, status,
                    today, reason, approved,
                    today, totalPresent, totalAbsent);

            summary.displaySummary();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage() + " - Student ID: 26901");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage() + " - Student ID: 26901");
        } finally {
            scanner.close();
        }
    }
}