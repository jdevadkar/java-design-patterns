package com.junit5.patientintake.notifier;

import java.util.ArrayList;

class EmailNotifierTestDouble implements EmailNotifier {

	ArrayList<Message> receivedMessages = new ArrayList<>();

	@Override
	public void sendNotification(String subject, String body, String address) {
		receivedMessages.add(new Message(address, subject, body));
	}

	class Message {
		public String toAddress;
		public String subject;
		public String body;

		public Message(String toAddress, String subject, String body) {
			super();
			this.toAddress = toAddress;
			this.subject = subject;
			this.body = body;
		}
	}
}
