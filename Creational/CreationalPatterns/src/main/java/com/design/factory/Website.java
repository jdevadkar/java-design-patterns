package com.design.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Website.
 */
public abstract class Website {

	/** The pages. */
	protected List<Page> pages = new ArrayList<Page>();

	/**
	 * Instantiates a new website.
	 */
	public Website() {
		this.createWebsite();
	}

	/**
	 * Gets the pages.
	 *
	 * @return the pages
	 */
	public List<Page> getPages() {
		return pages;
	}

	/**
	 * Creates the website.
	 */
	public abstract void createWebsite();

}
