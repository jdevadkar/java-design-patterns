package com.design.flyweight;
//catlog acts as a factory and cache for Item flyweight objects

import java.util.HashMap;
import java.util.Map;

/**
 * The Class Catlog.
 */
public class Catlog {

	/** The items. */
	private Map<String, Item> items = new HashMap<>();

	/**
	 * Lookup.
	 *
	 * @param itemName the item name
	 * @return the item
	 */
	// factory method
	public Item lookup(String itemName) {
		if (!items.containsKey(itemName)) {
			items.put(itemName, new Item(itemName));
		}
		return items.get(itemName);
	}

	/**
	 * Total item made.
	 *
	 * @return the int
	 */
	public int totalItemMade() {
		return items.size();
	}
}
