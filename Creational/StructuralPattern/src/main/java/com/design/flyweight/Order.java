package com.design.flyweight;

/**
 * The Class Order.
 */
public class Order {

	/** The order number. */
	private final int orderNumber;

	/** The item. */
	private final Item item;

	/**
	 * Instantiates a new order.
	 *
	 * @param orderNumber the order number
	 * @param item        the item
	 */
	Order(int orderNumber, Item item) {
		this.orderNumber = orderNumber;
		this.item = item;
	}

	/**
	 * Process order.
	 */
	void processOrder() {
		System.out.println("Ordering " + item + " for order number " + orderNumber);
	}
}
