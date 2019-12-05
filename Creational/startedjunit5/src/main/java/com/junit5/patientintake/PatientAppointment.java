package com.junit5.patientintake;

import java.time.LocalDateTime;

public class PatientAppointment {
	private String patientFirstName;
	private String patientLastName;
	private LocalDateTime appointmentDateTime;
	private Doctor doctor;
	private Double bmi;

	public PatientAppointment(String patientFirstName, String patientLastName, LocalDateTime appointmentDateTime,
			Doctor doctor, Double bmi) {
		super();
		this.patientFirstName = patientFirstName;
		this.patientLastName = patientLastName;
		this.appointmentDateTime = appointmentDateTime;
		this.doctor = doctor;
		this.bmi = bmi;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public LocalDateTime getAppointmentDateTime() {
		return appointmentDateTime;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public Double getBmi() {
		return bmi;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public void setBmi(Double bmi) {
		this.bmi = bmi;
	}
	
	
}
