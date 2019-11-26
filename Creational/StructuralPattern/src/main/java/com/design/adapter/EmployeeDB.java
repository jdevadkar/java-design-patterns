package com.design.adapter;

/**
 * The Class EmployeeDB.
 */
public class EmployeeDB implements Employee {

	/** The id. */
	private String id;

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The email. */
	private String email;

	/**
	 * Instantiates a new employee DB.
	 *
	 * @param id        the id
	 * @param firstName the first name
	 * @param lastName  the last name
	 * @param email     the email
	 */
	public EmployeeDB(String id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeDB [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.adapter.Employee#getId()
	 */
	@Override
	public String getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.adapter.Employee#getFirstName()
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.adapter.Employee#getLastName()
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.adapter.Employee#getEmail()
	 */
	@Override
	public String getEmail() {
		return email;
	}
}
