package com.design.facade;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * The Class FacadeEverydayDemo.
 */
public class FacadeEverydayDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception {

		URL url = new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen");

		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

		String inputLine;
		while ((inputLine = in.readLine()) != null) {
			System.out.println(inputLine);
		}
	}
}
