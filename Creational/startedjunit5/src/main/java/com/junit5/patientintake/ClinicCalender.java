package com.junit5.patientintake;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The Class ClinicCalender.
 */
public class ClinicCalender {

	/** The appointments. */
	private List<PatientAppointment> appointments;

	/** The today. */
	private LocalDate today;

	/**
	 * Instantiates a new clinic calender.
	 *
	 * @param today the today
	 */
	public ClinicCalender(LocalDate today) {
		this.today = today;
		this.appointments = new ArrayList<>();
	}

	/**
	 * Adds the appointment.
	 *
	 * @param patientFirstName the patient first name
	 * @param patientLastName  the patient last name
	 * @param doctorKey        the doctor key
	 * @param dateTime         the date time
	 */
	public void addAppointment(String patientFirstName, String patientLastName, String doctorKey, String dateTime) {
		Doctor doc = Doctor.valueOf(doctorKey.toLowerCase());
		LocalDateTime localDateTime = DateTimeConverter.convertStringToDateTime(dateTime, today);

		PatientAppointment appointment = new PatientAppointment(patientFirstName, patientLastName, localDateTime, doc,
				null);
		appointments.add(appointment);
	}

	/**
	 * Gets the appointments.
	 *
	 * @return the appointments
	 */
	public List<PatientAppointment> getAppointments() {
		return this.appointments;
	}

	/**
	 * Gets the today appointments.
	 *
	 * @return the today appointments
	 */
	public List<PatientAppointment> getTodayAppointments() {
		return getAppointmentForDate(today);
	}

	/**
	 * Gets the appointment for date.
	 *
	 * @param date the date
	 * @return the appointment for date
	 */
	public List<PatientAppointment> getAppointmentForDate(LocalDate date) {
		return appointments.stream().filter(appt -> appt.getAppointmentDateTime().toLocalDate().equals(date))
				.collect(Collectors.toList());
	}

	/**
	 * Gets the tomorrow appointments.
	 *
	 * @return the tomorrow appointments
	 */
	public List<PatientAppointment> getTomorrowAppointments() {
		LocalDate tomorrow = today.plusDays(1);
		return getAppointmentForDate(tomorrow);
	}

	/**
	 * Checks for appointment.
	 *
	 * @param date the date
	 * @return true, if successful
	 */
	public boolean hasAppointment(LocalDate date) {
		return appointments.stream().anyMatch(appt -> appt.getAppointmentDateTime().toLocalDate().equals(date));
	}
}
