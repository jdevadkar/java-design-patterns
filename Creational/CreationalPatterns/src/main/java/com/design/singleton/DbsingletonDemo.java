package com.design.singleton;

/**
 * The Class DbsingletonDemo.
 */
public class DbsingletonDemo {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		DbSingleton instance =DbSingleton.getInstance();
		System.out.println(instance);
		
		DbSingleton another =DbSingleton.getInstance();
		System.out.println(another);
	}

}
