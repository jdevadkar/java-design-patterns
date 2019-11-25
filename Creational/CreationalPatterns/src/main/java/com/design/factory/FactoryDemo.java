package com.design.factory;

/**
 * The Class FactoryDemo.
 */
public class FactoryDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		System.out.println(site.getPages());

		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		System.out.println(site.getPages());
	}
}
