package com.junit5.patientintake;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * The Class DateTimeConverter.
 */
public class DateTimeConverter {

	/**
	 * Convert string to date time.
	 *
	 * @param dateTime the date time
	 * @param today    the today
	 * @return the local date time
	 */
	public static LocalDateTime convertStringToDateTime(String dateTime, LocalDate today) {
		LocalDateTime localDateTime;
		try {
			if (dateTime.toLowerCase().startsWith("today")) {
				String[] parts = dateTime.split(" ", 2);
				LocalTime time = LocalTime.parse(parts[1].toUpperCase(),
						DateTimeFormatter.ofPattern("hh:mm a", Locale.US));
				localDateTime = LocalDateTime.of(today, time);
			} else {
				localDateTime = LocalDateTime.parse(dateTime.toUpperCase(),
						DateTimeFormatter.ofPattern("M/d/yyyy h:m a", Locale.US));
			}
		} catch (Throwable t) {
			throw new RuntimeException("Unable to create dat time from: [" + dateTime.toUpperCase()
					+ "], please enter with format[M/d/yyyy h:m a]");
		}
		return localDateTime;
	}
}
