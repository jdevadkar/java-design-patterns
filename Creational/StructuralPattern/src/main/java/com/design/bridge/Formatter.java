package com.design.bridge;

import java.util.List;

/**
 * The Interface Formatter.
 */
public interface Formatter {

	/**
	 * Format.
	 *
	 * @param header  the header
	 * @param details the details
	 * @return the string
	 */
	String format(String header, List<Detail> details);
}
