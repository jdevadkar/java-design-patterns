package com.junit5.patientintake;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The Class ClinicCalenderTest.
 */
class ClinicCalenderTest {

	private ClinicCalender calender;

	@BeforeAll
	static void testClassSetup() {
		System.out.println("Before all...");
	}

	@BeforeEach
	void init() {
		System.out.println("Before each...");
		calender = new ClinicCalender(LocalDate.of(2018, 8, 26));
	}

	/**
	 * Allow entry of appointment.
	 */
	@Test
	void allowEntryOfAppointment() {

		calender.addAppointment("Jim", "Weaver", "avery", "9/1/2018 02:00 PM");
		List<PatientAppointment> appointments = calender.getAppointments();
		assertNotNull(appointments);
		assertEquals(1, appointments.size());
		PatientAppointment enteredAppt = appointments.get(0);

		assertAll(() -> assertEquals("Jim", enteredAppt.getPatientFirstName()),
				() -> assertEquals("Weaver", enteredAppt.getPatientLastName()),
				() -> assertSame(Doctor.avery, enteredAppt.getDoctor()), () -> assertEquals("9/1/2018 02:00 PM",
						enteredAppt.getAppointmentDateTime().format(DateTimeFormatter.ofPattern("M/d/yyyy hh:mm a"))));
	}

	@Test
	void returnTrueForHasAppointmentsIfThereAreAppoientments() {

		calender.addAppointment("Jim", "Weaver", "avery", "9/1/2018 02:00 PM");
		assertTrue(calender.hasAppointment(LocalDate.of(2018, 9, 1)));
	}

	@Test
	void returnFalseForHasAppointmentsIfThereAreNoAppointments() {

		assertFalse(calender.hasAppointment(LocalDate.of(2018, 9, 1)));
	}

	@Test

	void retrunCurrentDaysAppointments() {

		calender.addAppointment("Jim", "Weaver", "avery", "12/4/2019 02:00 PM");
		calender.addAppointment("Jim", "Weaver", "avery", "12/4/2019 03:00 PM");
		calender.addAppointment("Jim", "Weaver", "avery", "9/1/2018 02:00 PM");
	}

	@AfterEach
	void tearDownEachTest() {
		System.out.println("After each...");
	}

	@AfterAll
	static void testDownTestCase() {
		System.out.println("After all...");
	}
}
