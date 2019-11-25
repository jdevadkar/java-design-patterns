package com.design.abstractfactory;

/**
 * The Interface Validator.
 */
public interface Validator {

	/**
	 * Checks if is valid.
	 *
	 * @param creditCard the credit card
	 * @return true, if is valid
	 */
	public boolean isValid(CreditCard creditCard);

}
