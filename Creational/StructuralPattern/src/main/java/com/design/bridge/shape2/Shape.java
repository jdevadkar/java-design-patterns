package com.design.bridge.shape2;

/**
 * The Class Shape.
 */
public abstract class Shape {

	/** The color. */
	protected Color color;

	/**
	 * Instantiates a new shape.
	 *
	 * @param color the color
	 */
	public Shape(Color color) {
		this.color = color;
	}

	/**
	 * Apply color.
	 */
	public abstract void applyColor();
}
