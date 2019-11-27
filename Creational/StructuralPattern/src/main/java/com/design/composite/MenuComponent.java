package com.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class MenuComponent.
 */
public abstract class MenuComponent {

	/** The name. */
	String name;

	/** The url. */
	String url;

	/** The menu components. */
	List<MenuComponent> menuComponents = new ArrayList<>();

	/**
	 * Adds the.
	 *
	 * @param menuComponent the menu component
	 * @return the menu component
	 */
	public MenuComponent add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}

	/**
	 * Removes the.
	 *
	 * @param menuComponent the menu component
	 * @return the menu component
	 */
	public MenuComponent remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException("Feature not implemented at this level");
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the url.
	 *
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	public abstract String toString();

	/**
	 * Prints the.
	 *
	 * @param menuComponent the menu component
	 * @return the string
	 */
	String print(MenuComponent menuComponent) {
		StringBuilder builder = new StringBuilder(name);
		builder.append(":");
		builder.append(url);
		builder.append("\n");
		return builder.toString();
	}
}
