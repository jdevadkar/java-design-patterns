package com.junit5.patientintake;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * The Class BMICalculatorTest.
 */
@DisplayName(" BMI Calculator Test")
class BMICalculatorTest {

	/**
	 * Calculate correctly.
	 */
	@Test
	@DisplayName("calculate BMI to two places correctly via inches and pounds")
	void calculateCorrectly() {
		assertEquals(19.2, BMICalculator.calculateBmi(69, 130));
		assertEquals(21.52, BMICalculator.calculateBmi(70, 150));
	}
}
