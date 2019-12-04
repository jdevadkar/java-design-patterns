package com.junit5.patientintake;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ClinicMain {
	private static ClinicCalender calender;

	public static void main(String[] args) throws Throwable {
		calender = new ClinicCalender(LocalDate.now());
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Patient Intake Computer System! \n\n");
		String lastOption = "";
		while (!lastOption.equalsIgnoreCase("x")) {
			lastOption = displayMenu(scanner);
		}
		System.out.println("\n Exiting System...\n");
	}

	private static String displayMenu(Scanner scanner) throws Throwable {
		System.out.println("Please select an option:");
		System.out.println("1. Enter a Patient Appontment");
		System.out.println("2. View All Apponetments");
		System.out.println("3. View Today's Appointments");
		System.out.println("X. Exit System.");
		System.out.println("Optiion:");
		String option = scanner.next();
		switch (option) {
		case "1":
			performPatientEntry(scanner);
			return option;

		case "2":
			performAllAppoinments();
			return option;
		case "3":
			performTodayAppointments();
			return option;
		default:
			System.out.println("Invalid option, please re-enter.");
			return option;
		}
	}

	private static void performPatientEntry(Scanner scanner) {
		scanner.nextLine();
		System.out.println("\n\nPlease Enter Appointment Info:");
		System.out.println("   Patient Last Name: ");
		String lastName = scanner.nextLine();
		System.out.println("   Patient First Name; ");
		String firstName = scanner.nextLine();
		System.out.println("   Appointment Date(M/d/yyyy h:m a): ");
		String when = scanner.nextLine();
		System.out.println("  Doctor Last Name: ");
		String doc = scanner.nextLine();
		try {
			calender.addAppointment(firstName, lastName, doc, when);
		} catch (Throwable t) {
			System.out.println("Error! " + t.getMessage());
			return;
		}
		System.out.println("Patient entered successfully.\n\n");
	}

	private static void performAllAppoinments() throws Throwable {
		System.out.println("\n\n All Appointments in System");
		for (PatientAppointment appointment : calender.getAppointments()) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy h:m a");
			String apptTime = formatter.format(appointment.getAppointmentDateTime());
			System.out.println(String.format("%s: %s, %s\t\tDoctor: %s", apptTime, appointment.getPatientLastName(),
					appointment.getPatientFirstName(), appointment.getDoctor().getName()));
		}
		System.out.println("\n Press any key to continue...");

	}

	private static void performTodayAppointments() {

	}

}
