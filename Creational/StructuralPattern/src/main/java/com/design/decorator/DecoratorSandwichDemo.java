package com.design.decorator;

/**
 * The Class DecoratorSandwichDemo.
 */
public class DecoratorSandwichDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
		System.out.println(sandwich.make());
	}
}
