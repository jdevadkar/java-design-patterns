
package com.design.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class MoviePrinter.
 */
public class MoviePrinter extends Printer {

	/** The movie. */
	private Movie movie;

	/**
	 * Instantiates a new movie printer.
	 *
	 * @param movie the movie
	 */
	public MoviePrinter(Movie movie) {
		this.movie = movie;
	}

	@Override
	protected List<Detail> getDetails() {
		List<Detail> details = new ArrayList<>();

		details.add(new Detail("Title", movie.getTitle()));
		details.add(new Detail("Year", movie.getYear()));
		details.add(new Detail("Runtime", movie.getRuntime()));
		return details;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.bridge.Printer#getHeader()
	 */
	@Override
	protected String getHeader() {
		return movie.getClassification();
	}

}
