package com.junit5.patientintake;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * The Class BMICalculator.
 */
public class BMICalculator {

	/**
	 * Calculate bmi.
	 *
	 * @param inches the inches
	 * @param pounds the pounds
	 * @return the double
	 */
	public static double calculateBmi(Integer inches, Integer pounds) {
		Double bmi = (double) (pounds * 703) / (inches * inches);
		return new BigDecimal(bmi).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
}
