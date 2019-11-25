package com.design.builder;

/**
 * The Class LunchOrderTeleDemo.
 */
public class LunchOrderTeleDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		LunchOrderTele lunchOrderTele = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");

//		lunchOrderTele.setBread("Wheat");
//		lunchOrderTele.setCondiaments("Lettuce");
//		lunchOrderTele.setDressing("Mustard");
//		lunchOrderTele.setMeat("Ham");

		System.out.println(lunchOrderTele.getBread());
		System.out.println(lunchOrderTele.getCondiaments());
		System.out.println(lunchOrderTele.getDressing());
		System.out.println(lunchOrderTele.getMeat());
	}
}
