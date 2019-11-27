package com.design.decorator;

/**
 * The Class SandwichDecorator.
 */
public abstract class SandwichDecorator implements Sandwich {

	/** The custom sandwich. */
	protected Sandwich customSandwich;

	/**
	 * Instantiates a new sandwich decorator.
	 *
	 * @param customSandwich the custom sandwich
	 */
	public SandwichDecorator(Sandwich customSandwich) {
		this.customSandwich = customSandwich;
	}

	@Override
	public String make() {
		return customSandwich.make();
	}
}
