package com.junit5.patientintake.notifier;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

import com.junit5.patientintake.ClinicCalender;
import com.junit5.patientintake.PatientAppointment;

/**
 * The Class UpcomingAppointmentnotifier.
 */
public class UpcomingAppointmentnotifier {

	/** The calender. */
	private ClinicCalender calender;

	/** The notifier. */
	private EmailNotifier notifier;

	/**
	 * Instantiates a new upcoming appointmentnotifier.
	 *
	 * @param calender the calender
	 * @param notifier the notifier
	 */
	public UpcomingAppointmentnotifier(ClinicCalender calender, EmailNotifier notifier) {
		this.calender = calender;
		this.notifier = notifier;
	}

	/**
	 * Run.
	 */
	public void run() {
		for (PatientAppointment appt : calender.getAppointments()) {
			String email = appt.getPatientLastName().toLowerCase() + appt.getPatientFirstName().toLowerCase()
					+ "@gmail.com";
			System.out.println("Sending with body: " + buildMessageBody(appt));
			notifier.sendNotification("Appointment Reminder", buildMessageBody(appt), email);
		}
	}

	/**
	 * Builds the message body.
	 *
	 * @param appt the appt
	 * @return the string
	 */
	private String buildMessageBody(PatientAppointment appt) {
		return "You have an appointment tomorrow at "
				+ appt.getAppointmentDateTime().format(DateTimeFormatter.ofPattern("h:mm a", Locale.US)) + " with Dr. "
				+ appt.getDoctor().getName() + ".";
	}
}
