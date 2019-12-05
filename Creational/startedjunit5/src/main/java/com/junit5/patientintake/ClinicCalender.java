package com.junit5.patientintake;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClinicCalender {
	private List<PatientAppointment> appointments;
	private LocalDate today;

	public ClinicCalender(LocalDate today) {
		this.today = today;
		this.appointments = new ArrayList<>();
	}

	public void addAppointment(String patientFirstName, String patientLastName, String doctorKey, String dateTime) {
		Doctor doc = Doctor.valueOf(doctorKey.toLowerCase());
		LocalDateTime localDateTime = DateTimeConverter.convertStringToDateTime(dateTime, today);

		PatientAppointment appointment = new PatientAppointment(patientFirstName, patientLastName, localDateTime, doc,
				null);
		appointments.add(appointment);
	}

	public List<PatientAppointment> getAppointments() {
		return this.appointments;
	}

	public List<PatientAppointment> getTodayAppointments() {
		return appointments.stream().filter(appt -> appt.getAppointmentDateTime().toLocalDate().equals(today))
				.collect(Collectors.toList());
	}

	public boolean hasAppointment(LocalDate date) {
		return appointments.stream().anyMatch(appt -> appt.getAppointmentDateTime().toLocalDate().equals(date));
	}
}
