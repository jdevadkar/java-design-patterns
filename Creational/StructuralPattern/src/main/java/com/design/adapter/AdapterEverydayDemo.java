package com.design.adapter;

import java.util.Arrays;
import java.util.List;

/**
 * The Class AdapterEverydayDemo.
 */
public class AdapterEverydayDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Integer[] arrayOfInts = new Integer[] { 42, 43, 44 };
		List<Integer> listOfInts = Arrays.asList(arrayOfInts);
		System.out.println(arrayOfInts);
		System.out.println(listOfInts);
	}
}
