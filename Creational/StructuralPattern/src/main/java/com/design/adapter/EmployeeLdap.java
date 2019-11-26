package com.design.adapter;

/**
 * The Class EmployeeLdap.
 */
public class EmployeeLdap {

	/** The cn. */
	private String cn;

	/** The surname. */
	private String surname;

	/** The given name. */
	private String givenName;

	/** The mail. */
	private String mail;

	/**
	 * Instantiates a new employee ldap.
	 *
	 * @param cn        the cn
	 * @param surname   the surname
	 * @param givenName the given name
	 * @param mail      the mail
	 */
	public EmployeeLdap(String cn, String surname, String givenName, String mail) {
		this.cn = cn;
		this.surname = surname;
		this.givenName = givenName;
		this.mail = mail;
	}

	/**
	 * Gets the cn.
	 *
	 * @return the cn
	 */
	public String getCn() {
		return cn;
	}

	/**
	 * Gets the surname.
	 *
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * Gets the given name.
	 *
	 * @return the given name
	 */
	public String getGivenName() {
		return givenName;
	}

	/**
	 * Gets the mail.
	 *
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}
}
