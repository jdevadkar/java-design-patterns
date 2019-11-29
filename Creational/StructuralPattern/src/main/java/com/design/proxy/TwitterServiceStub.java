package com.design.proxy;

/**
 * The Class TwitterServiceStub.
 */
public class TwitterServiceStub implements TwitterService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.proxy.TwitterService#getTimeline(java.lang.String)
	 */
	@Override
	public String getTimeline(String screenName) {
		return "my neato timeline";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.proxy.TwitterService#postToTimeline(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public void postToTimeline(String screenName, String message) {

	}

}
