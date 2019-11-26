package com.design.bridge;

/**
 * The Class BridgeDemo.
 */
public class BridgeDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setClassification("Action");
		movie.setTitle("Ram Dev");
		movie.setRuntime("2:15");
		movie.setYear("2019");

		Formatter printFormatter = new PrintFormatter();
		Printer moviePrinter = new MoviePrinter(movie);

		String printedMaterial = moviePrinter.print(printFormatter);

		System.out.println(printedMaterial);

		Formatter htmlFormatter = new HtmlFormatter();
		String htmlMaterial = moviePrinter.print(htmlFormatter);
		System.out.println(htmlMaterial);
	}

}
