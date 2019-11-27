package com.design.decorator;

/**
 * The Class DressingDecorator.
 */
public class DressingDecorator extends SandwichDecorator {

	/**
	 * Instantiates a new dressing decorator.
	 *
	 * @param customSandwich the custom sandwich
	 */
	public DressingDecorator(Sandwich customSandwich) {
		super(customSandwich);
	}

	@Override
	public String make() {
		return customSandwich.make() + addDressing();
	}

	/**
	 * Adds the dressing.
	 *
	 * @return the string
	 */
	private String addDressing() {
		return " + mustard";
	}
}
