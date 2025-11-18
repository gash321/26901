package _26901.q5;

import java.time.LocalDate;

public final class AttendanceSummary extends LeaveRequest {
    private LocalDate reportDate;
    private int totalPresent;
    private int totalAbsent;

    public AttendanceSummary(int id, LocalDate createdDate, LocalDate updatedDate,
                             String institutionName, String code, String address,
                             String departmentName, String departmentHead,
                             String courseName, String courseCode, int credits,
                             String instructorName, String email, String phone,
                             String studentName, String studentID, int age,
                             LocalDate sessionDate, String topic,
                             String attendanceStudentID, String sessionID, String status,
                             LocalDate requestDate, String reason, boolean approved,
                             LocalDate reportDate, int totalPresent, int totalAbsent) {
        super(id, createdDate, updatedDate, institutionName, code, address,
                departmentName, departmentHead, courseName, courseCode, credits,
                instructorName, email, phone, studentName, studentID, age,
                sessionDate, topic, attendanceStudentID, sessionID, status,
                requestDate, reason, approved);
        this.reportDate = reportDate;
        this.totalPresent = totalPresent;
        this.totalAbsent = totalAbsent;
    }

    public LocalDate getReportDate() { return reportDate; }
    public int getTotalPresent() { return totalPresent; }
    public int getTotalAbsent() { return totalAbsent; }

    public double generateSummary() {
        int totalSessions = totalPresent + totalAbsent;
        if (totalSessions == 0) return 0;
        return (double) totalPresent / totalSessions * 100;
    }

    public void displaySummary() {
        System.out.println("\n========================================");
        System.out.println("ID: 26901");
        System.out.println("========================================");
        System.out.println("Report Date: " + reportDate);
        System.out.println("----------------------------------------");
        System.out.println("Institution: " + getInstitutionName());
        System.out.println("Code: " + getCode());
        System.out.println("Address: " + getAddress());
        System.out.println("----------------------------------------");
        System.out.println("Department: " + getDepartmentName());
        System.out.println("Head: " + getDepartmentHead());
        System.out.println("----------------------------------------");
        System.out.println("Course: " + getCourseName());
        System.out.println("Course Code: " + getCourseCode());
        System.out.println("Credits: " + getCredits());
        System.out.println("----------------------------------------");
        System.out.println("Instructor: " + getInstructorName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println("----------------------------------------");
        System.out.println("Student: " + getStudentName());
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Age: " + getAge());
        System.out.println("----------------------------------------");
        System.out.println("Session Date: " + getSessionDate());
        System.out.println("Topic: " + getTopic());
        System.out.println("Session ID: " + getSessionID());
        System.out.println("Status: " + getStatus());
        System.out.println("----------------------------------------");
        System.out.println("Leave Request Date: " + getRequestDate());
        System.out.println("Reason: " + getReason());
        System.out.println("Approved: " + (isApproved() ? "Yes" : "No"));
        System.out.println("----------------------------------------");
        System.out.println("Total Present: " + totalPresent);
        System.out.println("Total Absent: " + totalAbsent);
        System.out.println("Total Sessions: " + (totalPresent + totalAbsent));
        System.out.println("----------------------------------------");
        System.out.println("ATTENDANCE PERCENTAGE: " + String.format("%.2f", generateSummary()) + "%");
        System.out.println("ID: 26901");
        System.out.println("========================================\n");
    }
}