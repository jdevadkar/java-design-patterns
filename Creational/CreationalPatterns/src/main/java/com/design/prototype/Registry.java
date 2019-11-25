package com.design.prototype;

import java.util.HashMap;
import java.util.Map;


/**
 * The Class Registry.
 */
public class Registry {

	/** The items. */
	private Map<String, Item> items = new HashMap<>();

	/**
	 * Instantiates a new registry.
	 */
	public Registry() {
		loadItems();
	}

	/**
	 * Creates the item.
	 *
	 * @param type the type
	 * @return the item
	 */
	public Item createItem(String type) {
		Item item = null;

		try {
			item = (Item) (items.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return item;
	}

	/**
	 * Load items.
	 */
	private void loadItems() {
		Movie movie = new Movie();
		movie.setTitle("Basic Movie");
		movie.setPrice(24.99);
		movie.setRuntime("2 hours");
		items.put("Movie", movie);

		Book book = new Book();
		book.setnumberOfPages(335);
		book.setPrice(19.99);
		book.setTitle("Basic book");
		items.put("Book", book);
	}
}
