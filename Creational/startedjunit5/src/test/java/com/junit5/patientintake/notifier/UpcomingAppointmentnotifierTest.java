package com.junit5.patientintake.notifier;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit5.patientintake.ClinicCalender;
import com.junit5.patientintake.Doctor;
import com.junit5.patientintake.PatientAppointment;

/**
 * The Class UpcomingAppointmentnotifierTest.
 */
class UpcomingAppointmentnotifierTest {

	/** The email double. */
	private EmailNotifierTestDouble emailDouble;

	/**
	 * Inits the.
	 */
	@BeforeEach
	void init() {
		emailDouble = new EmailNotifierTestDouble();
	}

	/**
	 * Sendnotification with correct format.
	 */
	@Test
	void sendnotificationWithCorrectFormat() {
		ClinicCalender calender = new ClinicCalender(LocalDate.of(2018, 8, 26));
		PatientAppointment appt = new PatientAppointment("Jim", "Weaver", LocalDateTime.of(2018, 8, 27, 14, 30),
				Doctor.avery, null);
		calender.addAppointment("Jim", "Weaver", "avery", "08/27/2018 2:00 pm");
		UpcomingAppointmentnotifier notifier = new UpcomingAppointmentnotifier(calender, emailDouble);
		notifier.run();

		assertEquals(1, emailDouble.receivedMessages.size());
		EmailNotifierTestDouble.Message expectedMessage = emailDouble.receivedMessages.get(0);
		assertAll(() -> assertEquals("weaverjim@gmail.com", expectedMessage.toAddress),
				() -> assertEquals("Appointment Reminder", expectedMessage.subject),
				() -> assertEquals("You have an appointment tomorrow at 2:00 PM " + "with Dr. Ralph Avery.",
						expectedMessage.body));
	}
}
