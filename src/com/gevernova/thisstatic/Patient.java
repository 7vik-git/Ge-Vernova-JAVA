package com.gevernova.thisstatic;
public class Patient {

    // Static variable shared among all patients
    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;

    // Final variable to uniquely identify each patient
    private final String patientID;

    // Instance variables
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' to initialize instance variables
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increase patient count on creation
    }

    // Static method to get total patients admitted
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details (with instanceof check)
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid Patient object.");
        }
    }

    // Main1 method to demonstrate functionality
    public static void main(String[] args) {
        Patient p1 = new Patient("P001", "Ravi Kumar", 45, "Flu");
        Patient p2 = new Patient("P002", "Sneha Roy", 32, "Fracture");

        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();
        System.out.println();

        Patient.getTotalPatients();
    }
}

