package com.design.bridge;

import java.util.List;

/**
 * The Class PrintFormatter.
 */
public class PrintFormatter implements Formatter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.design.bridge.Formatter#format(java.lang.String, java.util.List)
	 */
	@Override
	public String format(String header, List<Detail> details) {
		StringBuilder builder = new StringBuilder();
		builder.append(header);
		builder.append("\n");
		for (Detail detail : details) {
			builder.append(detail.getLabel());
			builder.append(":");
			builder.append(detail.getValue());
			builder.append("\n");
		}
		return builder.toString();
	}

}
