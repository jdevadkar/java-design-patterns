package com.design.flyweight;

/**
 * The Class FlyweightInventoryDemo.
 */
public class FlyweightInventoryDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		inventorySystem ims = new inventorySystem();
		ims.takeOrder("Roomba", 221);
		ims.takeOrder("Bose Headphones", 361);
		ims.takeOrder("Samsung TV", 432);
		ims.takeOrder("Samsung TV", 323);
		ims.takeOrder("Roomba", 563);
		ims.takeOrder("Bose Headphones", 321);
		ims.takeOrder("Roomba", 234);
		ims.takeOrder("Samsung TV", 54);
		ims.takeOrder("Roomba", 34);
		ims.takeOrder("Bose Headphones", 365);
		ims.takeOrder("Samsung TV", 332);
		ims.takeOrder("Roomba", 456);

		ims.process();

		System.out.println(ims.report());
	}
}
