package com.design.abstractfactory;

/**
 * A factory for creating Visa objects.
 */
public class VisaFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType) {
		case GOLD:
			return new VisaGoldCreditCard();

		case PLATINUM:
			return new VisaBlackCreditCard();
		default:
			break;
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {

		return new VisaValidator();
	}

}
