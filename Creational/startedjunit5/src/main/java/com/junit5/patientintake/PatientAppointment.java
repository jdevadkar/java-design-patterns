package com.junit5.patientintake;

import java.time.LocalDateTime;

/**
 * The Class PatientAppointment.
 */
public class PatientAppointment {

	/** The patient first name. */
	private String patientFirstName;

	/** The patient last name. */
	private String patientLastName;

	/** The appointment date time. */
	private LocalDateTime appointmentDateTime;

	/** The doctor. */
	private Doctor doctor;

	/** The bmi. */
	private Double bmi;

	/**
	 * Instantiates a new patient appointment.
	 *
	 * @param patientFirstName    the patient first name
	 * @param patientLastName     the patient last name
	 * @param appointmentDateTime the appointment date time
	 * @param doctor              the doctor
	 * @param bmi                 the bmi
	 */
	public PatientAppointment(String patientFirstName, String patientLastName, LocalDateTime appointmentDateTime,
			Doctor doctor, Double bmi) {
		super();
		this.patientFirstName = patientFirstName;
		this.patientLastName = patientLastName;
		this.appointmentDateTime = appointmentDateTime;
		this.doctor = doctor;
		this.bmi = bmi;
	}

	/**
	 * Gets the patient first name.
	 *
	 * @return the patient first name
	 */
	public String getPatientFirstName() {
		return patientFirstName;
	}

	/**
	 * Gets the patient last name.
	 *
	 * @return the patient last name
	 */
	public String getPatientLastName() {
		return patientLastName;
	}

	/**
	 * Gets the appointment date time.
	 *
	 * @return the appointment date time
	 */
	public LocalDateTime getAppointmentDateTime() {
		return appointmentDateTime;
	}

	/**
	 * Gets the doctor.
	 *
	 * @return the doctor
	 */
	public Doctor getDoctor() {
		return doctor;
	}

	/**
	 * Gets the bmi.
	 *
	 * @return the bmi
	 */
	public Double getBmi() {
		return bmi;
	}

	/**
	 * Sets the patient first name.
	 *
	 * @param patientFirstName the new patient first name
	 */
	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	/**
	 * Sets the patient last name.
	 *
	 * @param patientLastName the new patient last name
	 */
	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	/**
	 * Sets the appointment date time.
	 *
	 * @param appointmentDateTime the new appointment date time
	 */
	public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}

	/**
	 * Sets the doctor.
	 *
	 * @param doctor the new doctor
	 */
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	/**
	 * Sets the bmi.
	 *
	 * @param bmi the new bmi
	 */
	public void setBmi(Double bmi) {
		this.bmi = bmi;
	}
}
