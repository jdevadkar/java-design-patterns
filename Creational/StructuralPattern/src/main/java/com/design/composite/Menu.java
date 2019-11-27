package com.design.composite;

import java.util.Iterator;

/**
 * The Class Menu.
 */
public class Menu extends MenuComponent {

	/**
	 * Instantiates a new menu.
	 *
	 * @param name the name
	 * @param url  the url
	 */
	public Menu(String name, String url) {
		this.name = name;
		this.url = url;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();// builder Pattern

		builder.append(print(this));

		Iterator<MenuComponent> itr = menuComponents.iterator();
		while (itr.hasNext()) {
			MenuComponent menuComponent = itr.next();
			builder.append(menuComponent.toString());
		}
		return builder.toString();
	}

	public MenuComponent add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
		return menuComponent;
	}

	public MenuComponent remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
		return menuComponent;
	}
}
