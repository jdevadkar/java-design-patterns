package com.design.abstractfactory;

/**
 * The Class CreditCard.
 */
//AbstractProduct
public abstract class CreditCard {

	/** The card number length. */
	protected int cardNumberLength;

	/** The csc number. */
	protected int cscNumber;

	/**
	 * Gets the card number length.
	 *
	 * @return the card number length
	 */
	public int getCardNumberLength() {
		return cardNumberLength;
	}

	/**
	 * Sets the card number length.
	 *
	 * @param cardNumberLength the new card number length
	 */
	public void setCardNumberLength(int cardNumberLength) {
		this.cardNumberLength = cardNumberLength;
	}

	/**
	 * Gets the csc number.
	 *
	 * @return the csc number
	 */
	public int getCscNumber() {
		return cscNumber;
	}

	/**
	 * Sets the csc number.
	 *
	 * @param cscNumber the new csc number
	 */
	public void setCscNumber(int cscNumber) {
		this.cscNumber = cscNumber;
	}

}
