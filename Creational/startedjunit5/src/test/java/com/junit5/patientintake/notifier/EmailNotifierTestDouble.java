package com.junit5.patientintake.notifier;

import java.util.ArrayList;

/**
 * The Class EmailNotifierTestDouble.
 */
class EmailNotifierTestDouble implements EmailNotifier {

	/** The received messages. */
	ArrayList<Message> receivedMessages = new ArrayList<>();

	@Override
	public void sendNotification(String subject, String body, String address) {
		receivedMessages.add(new Message(address, subject, body));
	}

	/**
	 * The Class Message.
	 */
	class Message {

		/** The to address. */
		public String toAddress;

		/** The subject. */
		public String subject;

		/** The body. */
		public String body;

		/**
		 * Instantiates a new message.
		 *
		 * @param toAddress the to address
		 * @param subject   the subject
		 * @param body      the body
		 */
		public Message(String toAddress, String subject, String body) {
			super();
			this.toAddress = toAddress;
			this.subject = subject;
			this.body = body;
		}
	}
}
