package com.design.builder;

/**
 * The Class BuilderLunchOrderDemo.
 */
public class BuilderLunchOrderDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("Wheat").condiaments("Lettuce").dressing("Mayo").meat("Turkey");

		LunchOrder lunchOrder = builder.build();

		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiaments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
	}
}
