package com.design.abstractfactory;

/**
 * A factory for creating CreditCard objects.
 */
public abstract class CreditCardFactory {

	/**
	 * Gets the credit card factory.
	 *
	 * @param creaditScore the creadit score
	 * @return the credit card factory
	 */
	public static CreditCardFactory getCreditCardFactory(int creaditScore) {

		if (creaditScore > 650) {
			return new AmexFactory();
		} else {
			return new VisaFactory();
		}
	}

	/**
	 * Gets the credit card.
	 *
	 * @param cardType the card type
	 * @return the credit card
	 */
	public abstract CreditCard getCreditCard(CardType cardType);

	/**
	 * Gets the validator.
	 *
	 * @param cardType the card type
	 * @return the validator
	 */
	public abstract Validator getValidator(CardType cardType);

}
