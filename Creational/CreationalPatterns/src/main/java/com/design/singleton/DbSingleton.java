package com.design.singleton;

/**
 * The Class DbSingleton.
 */
public class DbSingleton {

	/** The instance. */
	private static volatile DbSingleton instance = new DbSingleton();

	/**
	 * Instantiates a new db singleton.
	 */
	private DbSingleton() {
		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to create ");
		}
	}

	/**
	 * Gets the single instance of DbSingleton.
	 *
	 * @return single instance of DbSingleton
	 */
	public static DbSingleton getInstance() {
		if (instance == null) {
			synchronized (DbSingleton.class) {
				if (instance == null) {
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}
}
