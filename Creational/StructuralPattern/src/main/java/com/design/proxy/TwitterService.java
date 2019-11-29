package com.design.proxy;

/**
 * The Interface TwitterService.
 */
public interface TwitterService {

	/**
	 * Gets the timeline.
	 *
	 * @param screenName the screen name
	 * @return the timeline
	 */
	public String getTimeline(String screenName);

	/**
	 * Post to timeline.
	 *
	 * @param screenName the screen name
	 * @param message    the message
	 */
	public void postToTimeline(String screenName, String message);

}
