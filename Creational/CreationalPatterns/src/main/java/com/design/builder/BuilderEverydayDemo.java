package com.design.builder;


/**
 * The Class BuilderEverydayDemo.
 */
public class BuilderEverydayDemo {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();
		builder.append("This is an example");
		builder.append("of the builder pattern.");
		builder.append("It has methods to append");
		builder.append("almost anything we want to a String. ");
		builder.append(42);
		System.out.println(builder.toString());
	}
}
