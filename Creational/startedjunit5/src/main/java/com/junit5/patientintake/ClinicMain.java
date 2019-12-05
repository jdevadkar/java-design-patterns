package com.junit5.patientintake;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * The Class ClinicMain.
 */
public class ClinicMain {

	/** The calender. */
	private static ClinicCalender calender;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Throwable the throwable
	 */
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

	/**
	 * Display menu.
	 *
	 * @param scanner the scanner
	 * @return the string
	 * @throws Throwable the throwable
	 */
	private static String displayMenu(Scanner scanner) throws Throwable {
		System.out.println("Please select an option:");
		System.out.println("1. Enter a Patient Appontment");
		System.out.println("2. View All Apponetments");
		System.out.println("3. View Today's Appointments");
		System.out.println("4. Enter Patient Height Weight");
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
		case "4":
			performHeightWeight(scanner);
			return option;
		default:
			System.out.println("Invalid option, please re-enter.");
			return option;
		}
	}

	/**
	 * Perform patient entry.
	 *
	 * @param scanner the scanner
	 */
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

	/**
	 * Perform all appoinments.
	 *
	 * @throws Throwable the throwable
	 */
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

	/**
	 * Perform today appointments.
	 *
	 * @throws Throwable the throwable
	 */
	private static void performTodayAppointments() throws Throwable {
		System.out.println("\n\n Appoientments for Today:");
		listAppoinnments(calender.getAppointments());
	}

	/**
	 * List appoinnments.
	 *
	 * @param appointments the appointments
	 */
	private static void listAppoinnments(List<PatientAppointment> appointments) {
		for (PatientAppointment appointment : appointments) {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy hh:mm a");
			String apptTime = formatter.format(appointment.getAppointmentDateTime());
			System.out.println(String.format("%s: %s, %s\t\t Doctor: %s", apptTime, appointment.getPatientLastName(),
					appointment.getPatientFirstName(), appointment.getDoctor().getName()));
		}
	}

	/**
	 * Perform height weight.
	 *
	 * @param scanner the scanner
	 */
	private static void performHeightWeight(Scanner scanner) {
		scanner.nextLine();
		System.out.println("\n\nEntere parient height and weight for today's appointment:");
		System.out.println(" Patient LastName");
		String lastName = scanner.nextLine();
		System.out.println(" Patient First Name: ");
		String firstName = scanner.nextLine();
		PatientAppointment appt = findPatientAppointment(lastName, firstName).orElse(null);
		if (appt != null) {
			System.out.println(" Height in Inches: ");
			Integer inches = scanner.nextInt();
			System.out.println(" Weight in Pounds: ");
			Integer pounds = scanner.nextInt();
			double roundedToTwoPlaces = BMICalculator.calculateBmi(inches, pounds);
			appt.setBmi(roundedToTwoPlaces);
			System.out.println("Set patient BMI to " + roundedToTwoPlaces + "\n\n");
		} else {
			System.out.println();
		}
	}

	/**
	 * Find patient appointment.
	 *
	 * @param lastName  the last name
	 * @param firstName the first name
	 * @return the optional
	 */
	private static Optional<PatientAppointment> findPatientAppointment(String lastName, String firstName) {
		return calender.getAppointments().stream().filter(p -> (p.getPatientLastName().equalsIgnoreCase(lastName)
				&& p.getPatientFirstName().equalsIgnoreCase(firstName))).findFirst();
	}
}
