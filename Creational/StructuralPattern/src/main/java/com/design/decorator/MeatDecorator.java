package com.design.decorator;

/**
 * The Class MeatDecorator.
 */
public class MeatDecorator extends SandwichDecorator {

	/**
	 * Instantiates a new meat decorator.
	 *
	 * @param customSandwich the custom sandwich
	 */
	public MeatDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	@Override
	public String make() {

		return customSandwich.make() + addMeat();
	}

	/**
	 * Adds the meat.
	 *
	 * @return the string
	 */
	private String addMeat() {
		return " + turkey";
	}
}
