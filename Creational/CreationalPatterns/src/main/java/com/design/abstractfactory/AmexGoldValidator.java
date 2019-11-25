package com.design.abstractfactory;

/**
 * The Class AmexGoldValidator.
 */
public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}

}
