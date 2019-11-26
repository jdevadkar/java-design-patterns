package com.design.bridge;

import java.util.List;

/**
 * The Class Printer.
 */
public abstract class Printer {

	/**
	 * Prints the.
	 *
	 * @param formatter the formatter
	 * @return the string
	 */
	public String print(Formatter formatter) {
		return formatter.format(getHeader(), getDetails());
	}

	/**
	 * Gets the details.
	 *
	 * @return the details
	 */
	protected abstract List<Detail> getDetails();

	/**
	 * Gets the header.
	 *
	 * @return the header
	 */
	protected abstract String getHeader();
}
