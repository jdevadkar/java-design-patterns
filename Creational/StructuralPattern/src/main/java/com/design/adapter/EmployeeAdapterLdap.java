package com.design.adapter;

/**
 * The Class EmployeeAdapterLdap.
 */
public class EmployeeAdapterLdap implements Employee {

	/** The instance. */
	private EmployeeLdap instance;

	/**
	 * Instantiates a new employee adapter ldap.
	 *
	 * @param instance the instance
	 */
	public EmployeeAdapterLdap(EmployeeLdap instance) {
		this.instance = instance;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.adapter.Employee#getId()
	 */
	@Override
	public String getId() {
		return instance.getCn();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.adapter.Employee#getFirstName()
	 */
	@Override
	public String getFirstName() {
		return instance.getGivenName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.adapter.Employee#getLastName()
	 */
	@Override
	public String getLastName() {
		return instance.getSurname();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.adapter.Employee#getEmail()
	 */
	@Override
	public String getEmail() {
		return instance.getMail();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ID: " + instance.getCn();
	}
}
