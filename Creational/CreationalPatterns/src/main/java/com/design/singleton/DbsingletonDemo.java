package com.design.singleton;

public class DbsingletonDemo {
	public static void main(String[] args) {
		
		DbSingleton instance =DbSingleton.getInstance();
		System.out.println(instance);
		
		DbSingleton another =DbSingleton.getInstance();
		System.out.println(another);
	}

}
