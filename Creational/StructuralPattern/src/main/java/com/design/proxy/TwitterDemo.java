package com.design.proxy;

/**
 * The Class TwitterDemo.
 */
public class TwitterDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

		System.out.println(service.getTimeline("bh5k"));
	}

}
