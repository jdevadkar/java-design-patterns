package com.junit5.patientintake;

/**
 * The Enum Doctor.
 */
public enum Doctor {

	/** The avery. */
	avery("Ralph Avery"),
	/** The johnson. */
	johnson("Beth johnson"),
	/** The murphy. */
	murphy("Pat Murpy");

	/** The name. */
	private String name;

	/**
	 * Instantiates a new doctor.
	 *
	 * @param name the name
	 */
	Doctor(String name) {
		this.name = name;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
