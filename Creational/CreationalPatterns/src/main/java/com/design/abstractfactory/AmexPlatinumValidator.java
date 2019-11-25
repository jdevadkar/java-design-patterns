package com.design.abstractfactory;

/**
 * The Class AmexPlatinumValidator.
 */
public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}
}
