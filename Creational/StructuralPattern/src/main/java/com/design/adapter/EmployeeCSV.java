package com.design.adapter;

import java.util.StringTokenizer;

/**
 * The Class EmployeeCSV.
 */
public class EmployeeCSV {

	/** The id. */
	private int id;

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The email address. */
	private String emailAddress;

	/**
	 * Instantiates a new employee CSV.
	 *
	 * @param values the values
	 */
	public EmployeeCSV(String values) {
		StringTokenizer tokenizer = new StringTokenizer(values, ",");
		if (tokenizer.hasMoreElements()) {
			id = Integer.parseInt(tokenizer.nextToken());
		}
		if (tokenizer.hasMoreElements()) {
			firstName = tokenizer.nextToken();
		}
		if (tokenizer.hasMoreElements()) {
			lastName = tokenizer.nextToken();
		}
		if (tokenizer.hasMoreElements()) {
			emailAddress = tokenizer.nextToken();
		}
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Gets the email address.
	 *
	 * @return the email address
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeCSV [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress="
				+ emailAddress + "]";
	}
}
