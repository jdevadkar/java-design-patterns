package com.junit5.patientintake.notifier;

/**
 * The Interface EmailNotifier.
 */
public interface EmailNotifier {

	/**
	 * Send notification.
	 *
	 * @param subject the subject
	 * @param body    the body
	 * @param address the address
	 */
	void sendNotification(String subject, String body, String address);
}