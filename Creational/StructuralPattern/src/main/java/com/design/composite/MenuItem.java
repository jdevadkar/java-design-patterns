package com.design.composite;

/**
 * The Class MenuItem.
 */
public class MenuItem extends MenuComponent {

	/**
	 * Instantiates a new menu item.
	 *
	 * @param name the name
	 * @param url  the url
	 */
	public MenuItem(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public String toString() {
		return print(this);
	}
}
