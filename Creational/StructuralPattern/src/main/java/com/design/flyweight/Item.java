package com.design.flyweight;

/**
 * The Class Item.
 */
class Item {

	/** The name. */
	private final String name;

	/**
	 * Instantiates a new item.
	 *
	 * @param name the name
	 */
	public Item(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return name;
	}
}
