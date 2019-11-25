package com.design.builder;

/**
 * The Class LunchOrderBeanDemo.
 */
public class LunchOrderBeanDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		LunchOrderbean lunchOrderBean = new LunchOrderbean();

		lunchOrderBean.setBread("Wheat");
		lunchOrderBean.setCondiaments("Lettuce");
		lunchOrderBean.setDressing("Mustard");
		lunchOrderBean.setMeat("Ham");

		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiaments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());
	}

}
