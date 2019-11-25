package com.design.prototype;

import java.util.List;

/**
 * The Class Statement.
 */
public class Statement implements Cloneable {

	/** The sql. */
	private String sql;

	/** The parameters. */
	private List<String> parameters;

	/** The record. */
	private Record record;

	/**
	 * Instantiates a new statement.
	 *
	 * @param sql        the sql
	 * @param parameters the parameters
	 * @param record     the record
	 */
	public Statement(String sql, List<String> parameters, Record record) {
		this.sql = sql;
		this.parameters = parameters;
		this.record = record;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	public Statement clone() {
		try {
			return (Statement) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Gets the sql.
	 *
	 * @return the sql
	 */
	public String getSql() {
		return sql;
	}

	/**
	 * Gets the parameters.
	 *
	 * @return the parameters
	 */
	public List<String> getParameters() {
		return parameters;
	}

	/**
	 * Gets the record.
	 *
	 * @return the record
	 */
	public Record getRecord() {
		return record;
	}

}
