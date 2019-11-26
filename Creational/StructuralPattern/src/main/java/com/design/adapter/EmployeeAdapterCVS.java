package com.design.adapter;

/**
 * The Class EmployeeAdapterCVS.
 */
public class EmployeeAdapterCVS implements Employee {

	/** The instance. */
	private EmployeeCSV instance;

	/**
	 * Instantiates a new employee adapter CVS.
	 *
	 * @param instance the instance
	 */
	public EmployeeAdapterCVS(EmployeeCSV instance) {
		this.instance = instance;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.adapter.Employee#getId()
	 */
	@Override
	public String getId() {
		return instance.getId() + "";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.adapter.Employee#getFirstName()
	 */
	@Override
	public String getFirstName() {
		return instance.getFirstName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.adapter.Employee#getLastName()
	 */
	@Override
	public String getLastName() {
		return instance.getLastName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.adapter.Employee#getEmail()
	 */
	@Override
	public String getEmail() {
		return instance.getEmailAddress();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "ID: " + instance.getId() + "FirstName: " + instance.getFirstName();
	}
}
