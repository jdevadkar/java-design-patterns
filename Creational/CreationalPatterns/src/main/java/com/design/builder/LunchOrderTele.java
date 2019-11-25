package com.design.builder;

/**
 * The Class LunchOrderTele.
 */
public class LunchOrderTele {

	/** The bread. */
	private String bread;

	/** The condiaments. */
	private String condiaments;

	/** The dressing. */
	private String dressing;

	/** The meat. */
	private String meat;

	/**
	 * Instantiates a new lunch order tele.
	 *
	 * @param bread the bread
	 */
	public LunchOrderTele(String bread) {
		this.bread = bread;
	}

	/**
	 * Instantiates a new lunch order tele.
	 *
	 * @param bread       the bread
	 * @param condiaments the condiaments
	 */
	public LunchOrderTele(String bread, String condiaments) {
		this(bread);
		this.condiaments = condiaments;
	}

	/**
	 * Instantiates a new lunch order tele.
	 *
	 * @param bread       the bread
	 * @param condiaments the condiaments
	 * @param dressing    the dressing
	 */
	public LunchOrderTele(String bread, String condiaments, String dressing) {
		this(bread, condiaments);
		this.dressing = dressing;
	}

	/**
	 * Instantiates a new lunch order tele.
	 *
	 * @param bread       the bread
	 * @param condiaments the condiaments
	 * @param dressing    the dressing
	 * @param meat        the meat
	 */
	public LunchOrderTele(String bread, String condiaments, String dressing, String meat) {
		this(bread, condiaments, dressing);
		this.meat = meat;
	}

	/**
	 * Gets the bread.
	 *
	 * @return the bread
	 */
	public String getBread() {
		return bread;
	}

	/**
	 * Gets the condiaments.
	 *
	 * @return the condiaments
	 */
	public String getCondiaments() {
		return condiaments;
	}

	/**
	 * Gets the dressing.
	 *
	 * @return the dressing
	 */
	public String getDressing() {
		return dressing;
	}

	/**
	 * Gets the meat.
	 *
	 * @return the meat
	 */
	public String getMeat() {
		return meat;
	}
}
