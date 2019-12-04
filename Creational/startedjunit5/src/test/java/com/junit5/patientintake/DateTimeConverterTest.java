package com.junit5.patientintake;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("dateTime")
@DisplayName("DateTimeConverter Test")
class DateTimeConverterTest {

	@Nested
	@DisplayName("convert string with 'today' keyword")
	class TodayTests {
		@Test
		@DisplayName(" correctly")
		void convertTodayStringCorrectly() {
			LocalDate today = LocalDate.of(2019, 12, 4);
			LocalDateTime result = DateTimeConverter.convertStringToDateTime("today 01:00 PM", today);
			assertEquals(result, LocalDateTime.of(2019, 12, 4, 13, 0),
					() -> "Failed to convert 'today' String to expected data time, today passed was:" + today);
		}

		@Test
		@DisplayName(" regardless of case")
		void convertTodayStringCorrectlyCaseInsensitive() {
			LocalDate today = LocalDate.of(2019, 12, 4);
			LocalDateTime result = DateTimeConverter.convertStringToDateTime("ToDay 01:00 PM", today);
			assertEquals(result, LocalDateTime.of(2019, 12, 4, 13, 0),
					() -> "Failed to convert 'today' String to expected data time, today passed was:" + today);
		}

	}

	@Test
	@DisplayName("convert expected date time pattern in string correctly")
	void convertCorrectPatternToDateTime() {
		LocalDateTime result = DateTimeConverter.convertStringToDateTime("9/2/2018 01:00 PM",
				LocalDate.of(2019, 12, 4));
		assertEquals(result, LocalDateTime.of(2018, 9, 2, 13, 0));
	}

	@Test
	@DisplayName("throw exception if entered pattern of string incorrect")
	void throwExceptionIfIncorrectPatternProvided() {
		Throwable error = assertThrows(RuntimeException.class,
				() -> DateTimeConverter.convertStringToDateTime("9/2/2018 0100 PM", LocalDate.of(2019, 12, 4)));
		assertEquals("Unable to create dat time from: [9/2/2018 0100 PM], please enter with format[M/d/yyyy h:m a]",
				error.getMessage());
	}
}
