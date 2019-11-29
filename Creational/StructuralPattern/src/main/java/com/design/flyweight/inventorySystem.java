package com.design.flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * The Class inventorySystem.
 */
public class inventorySystem {

	/** The catalog. */
	private final Catlog catalog = new Catlog();

	/** The orders. */
	private final List<Order> orders = new CopyOnWriteArrayList<>();

	/**
	 * Take order.
	 *
	 * @param itemName    the item name
	 * @param orderNumber the order number
	 */
	void takeOrder(String itemName, int orderNumber) {
		Item item = catalog.lookup(itemName);
		Order order = new Order(orderNumber, item);
		orders.add(order);
	}

	/**
	 * Process.
	 */
	void process() {
		for (Order order : orders) {
			order.processOrder();
			orders.remove(order);
		}
	}

	/**
	 * Report.
	 *
	 * @return the string
	 */
	String report() {
		return "\nTotal Item objects made: " + catalog.totalItemMade();
	}
}
