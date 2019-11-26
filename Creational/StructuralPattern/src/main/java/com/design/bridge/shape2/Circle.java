package com.design.bridge.shape2;

/**
 * The Class Circle.
 */
public class Circle extends Shape {

	/**
	 * Instantiates a new circle.
	 *
	 * @param color the color
	 */
	public Circle(Color color) {
		super(color);
	}

	
	@Override
	public void applyColor() {
		color.applyColor();

	}

}
