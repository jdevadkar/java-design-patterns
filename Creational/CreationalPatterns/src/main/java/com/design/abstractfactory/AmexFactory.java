package com.design.abstractfactory;

/**
 * A factory for creating Amex objects.
 */
public class AmexFactory extends CreditCardFactory {

	/*
	 * 
	 * 
	 * @see com.design.abstractfactory.CreditCardFactory#getCreditCard(com.design.
	 * abstractfactory.CardType)
	 */
	@Override
	public CreditCard getCreditCard(CardType cardType) {

		switch (cardType) {
		case GOLD:
			return new AmexGoldCreditCard();
		case PLATINUM:
			return new AmexPlatinumCreditCard();

		default:
			break;
		}
		return null;
	}

	/*
	 * 
	 * 
	 * @see com.design.abstractfactory.CreditCardFactory#getValidator(com.design.
	 * abstractfactory.CardType)
	 */
	@Override
	public Validator getValidator(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new AmexGoldValidator();
		case PLATINUM:
			return new AmexPlatinumValidator();

		default:
			break;
		}
		return null;
	}

}
