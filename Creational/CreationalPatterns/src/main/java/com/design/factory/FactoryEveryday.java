package com.design.factory;

import java.util.Calendar;

/**
 * The Class FactoryEveryday.
 */
public class FactoryEveryday {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		System.out.println(cal);

		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}

}
