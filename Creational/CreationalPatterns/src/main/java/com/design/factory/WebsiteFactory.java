package com.design.factory;

/**
 * A factory for creating Website objects.
 */
public class WebsiteFactory {

	/**
	 * Gets the website.
	 *
	 * @param siteType the site type
	 * @return the website
	 */
	public static Website getWebsite(WebsiteType siteType) {
		switch (siteType) {
		case BLOG: {
			return new Blog();
		}
		case SHOP: {
			return new Shop();
		}
		default: {
			return null;
		}
		}
	}

}
