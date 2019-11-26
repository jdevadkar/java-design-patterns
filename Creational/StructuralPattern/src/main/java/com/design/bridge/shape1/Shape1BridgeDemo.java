package com.design.bridge.shape1;

/**
 * The Class Shape1BridgeDemo.
 */
public class Shape1BridgeDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Circle circle = new BlueCircle();

		Square square = new RedSquare();
		Square greenSquare = new GreenSquare();

		circle.applyColor();
		square.applyColor();
		greenSquare.applyColor();
	}
}
