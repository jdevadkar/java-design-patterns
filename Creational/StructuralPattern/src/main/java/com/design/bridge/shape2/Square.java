package com.design.bridge.shape2;

/**
 * The Class Square.
 */
public class Square extends Shape {

	/**
	 * Instantiates a new square.
	 *
	 * @param color the color
	 */
	public Square(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		color.applyColor();

	}
}
